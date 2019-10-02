package com.example.jypnote.ui.main.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object Factory {
        fun getClient(): Retrofit {
            val interceptor: HttpLoggingInterceptor? = HttpLoggingInterceptor()
            interceptor!!.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client: OkHttpClient? = OkHttpClient.Builder().addInterceptor(interceptor).build()
            return Retrofit.Builder()
                .baseUrl("http://localhost:8100")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()

        }
    }

}