package com.rxjang.bookery.book.service

import com.google.gson.GsonBuilder
import com.rxjang.bookery.book.api.AladinOpenApi
import com.rxjang.bookery.book.model.dto.AladinSearchRequest
import com.rxjang.bookery.book.model.dto.AladinSearchResult
import com.rxjang.bookery.book.repository.BookRepository
import com.rxjang.bookery.common.Log
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Service
@Transactional(readOnly = true)
class BookService (
    val bookRepository: BookRepository,
    val aladinOpenApi: AladinOpenApi
        ) {

    companion object : Log()

    fun search(keyword: String) {

        val request = AladinSearchRequest(Query = "토지")
        val GSON_MAPPER = GsonBuilder().serializeNulls().create()
        val options: Map<String, String> = GSON_MAPPER.fromJson(GSON_MAPPER.toJson(request), Map::class.java) as Map<String, String>

        val call = aladinOpenApi.search(options)

        call.enqueue(object :Callback<AladinSearchResult> {
            override fun onResponse(call: Call<AladinSearchResult>, response: Response<AladinSearchResult>) {
                if (response.isSuccessful) {
                    logger.debug("response => {}", response.body())
                    // TODO db insert
                }
            }

            override fun onFailure(call: Call<AladinSearchResult>, t: Throwable) {
                throw RuntimeException(t.toString())
            }
        })


    }
}