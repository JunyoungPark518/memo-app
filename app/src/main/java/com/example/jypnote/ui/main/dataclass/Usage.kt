package com.example.jypnote.ui.main.dataclass

data class Usage(
  val id: Int? = 0
, val cardName: String? = null
, val usageName: String
, val datetime: String
, val price: Int
, val discount: Int
, val payPrice: Int
, val summation: Int
, val pageSize: Int
, val startIndex: Int)