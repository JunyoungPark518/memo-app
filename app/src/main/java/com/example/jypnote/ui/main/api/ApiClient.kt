package com.example.jypnote.ui.main.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object Factory {

        var baseUrl : String = "http://192.168.43.76:8100"

        fun getClient(): Retrofit {
            val interceptor: HttpLoggingInterceptor? = HttpLoggingInterceptor()
            interceptor!!.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client: OkHttpClient? = OkHttpClient.Builder().addInterceptor(interceptor).build()
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()

        }
    }

}