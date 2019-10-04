package com.example.jypnote.ui.main.model

import com.google.gson.annotations.SerializedName

class BankMain {
    @SerializedName("result") val result: String? = "Y"
    @SerializedName("list") val list: List<Bank>? = null

}