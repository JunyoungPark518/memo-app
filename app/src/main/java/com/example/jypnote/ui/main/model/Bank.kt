package com.example.jypnote.ui.main.model

import com.google.gson.annotations.SerializedName

class Bank {
    @SerializedName("name") val name: String? = ""
    @SerializedName("account") val account: String? = ""
    @SerializedName("maskAccount") val maskAccount: String? = ""
}