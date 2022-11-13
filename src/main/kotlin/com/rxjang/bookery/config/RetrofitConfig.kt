package com.rxjang.bookery.config

import com.google.gson.GsonBuilder
import com.rxjang.bookery.book.api.AladinOpenApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Configuration
class RetrofitConfig {

    private val loggingInterceptor: HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private fun getClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(loggingInterceptor)
            .build();
    }

    @Bean
    fun getTeamsWebHookApi(): AladinOpenApi {

        val gson = GsonBuilder().setLenient().create()

        return Retrofit.Builder()
            .baseUrl("https://www.aladin.co.kr")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(getClient())
            .build()
            .create(AladinOpenApi::class.java);
    }
}