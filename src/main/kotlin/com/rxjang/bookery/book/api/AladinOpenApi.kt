package com.rxjang.bookery.book.api

import com.rxjang.bookery.book.model.dto.AladinSearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface AladinOpenApi {

    @GET("/ttb/api/ItemSearch.aspx")
    fun search(@QueryMap options: Map<String, String>): Call<AladinSearchResult>
}