package com.example.jypnote.ui.main.model

import com.google.gson.annotations.SerializedName

class Card {
    @SerializedName("cardId") val cardId: Int? = 0
    @SerializedName("cardName") val cardName: String? = ""
    @SerializedName("description") val description: String? = ""
    @SerializedName("limitDetail") val limitDetail: String? = ""
    @SerializedName("minPrice") val minPrice: Int? = 0
    @SerializedName("creditYn") val creditYn: String? = "Y"
    @SerializedName("withdrawDay") val withdrawDay: String? = "01"
    @SerializedName("cardNo") val cardNo: String? = ""
    @SerializedName("maskCardNo") val maskCardNo: String? = ""
    @SerializedName("cardCvc") val cardCvc: String? = ""
    @SerializedName("validMy") val validMy: String? = ""
    @SerializedName("brand") val brand: String? = "MASTER"
    @SerializedName("annualFee") val annualFee: Int? = 0
    @SerializedName("publishDate") val publishDate: String? = ""
    @SerializedName("useYn") val useYn: String? = "Y"

}