package com.example.jypnote.ui.main.model

import com.google.gson.annotations.SerializedName

class CardMain {
    @SerializedName("result") val result: String? = "Y"
    @SerializedName("list") val list: List<Card>? = null

}