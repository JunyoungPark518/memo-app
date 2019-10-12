package com.example.jypnote.ui.main.api

import com.example.jypnote.ui.main.dataclass.Meta
import com.example.jypnote.ui.main.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterface {

    @GET("meta")
    fun meta(@Query("platform") platform: String, @Query("appVersion") appVersion: String): Call<Meta>

    @GET("bank/list")
    fun getBankList(@Query("userId") userId: Int): Call<BankMain>

    @POST("card/create")
    fun createCard(card: Card)

    @GET("card/list")
    fun getCardList(@Query("userId") userId: Int): Call<CardMain>

    @GET("usage/list")
    fun getUsageList(@Query("userId") userId: Int, @Query("cardId") cardId: Int? = null, @Query("startIndex") startIndex: Int = 0, @Query("pageSize") pageSize: Int = 10): Call<Usage>
}