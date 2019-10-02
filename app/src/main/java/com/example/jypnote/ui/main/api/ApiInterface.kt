package com.example.jypnote.ui.main.api

import com.example.jypnote.ui.main.dataclass.Bank
import com.example.jypnote.ui.main.dataclass.Card
import com.example.jypnote.ui.main.dataclass.Usage
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @GET("bank/list")
    fun selectBankList(): Call<Bank>

    @POST("card/create")
    fun createCard(card: Card)

    @GET("card/list")
    fun selectCardList(): Call<Card>

    @GET("usage/list")
    fun selectUsageList(startIndex: Int, pageSize: Int): Call<Usage>
}