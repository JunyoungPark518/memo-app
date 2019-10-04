package com.example.jypnote.ui.main.model

import com.google.gson.annotations.SerializedName

class Usage {
    @SerializedName("cardName") val cardName: String? = ""
    @SerializedName("origin") val origin: Int? = 0
    @SerializedName("percent") val percent: Double? = 0.0
    @SerializedName("minusPrice") val minusPrice: Int? = 0
    @SerializedName("finalPrice") val finalPrice: Int? = 0
    @SerializedName("usageName") val usageName: String? = ""
    @SerializedName("memo") val memo: String? = ""
    @SerializedName("cancelYn") val cancelYn: String? = "N"
    @SerializedName("prepaidYn") val prepaidYn: String? = "N"
    @SerializedName("createTime") val createTime: String? = ""
    @SerializedName("cancelTime") val cancelTime: String? = ""
}