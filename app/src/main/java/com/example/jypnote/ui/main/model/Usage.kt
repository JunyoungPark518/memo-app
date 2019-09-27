package com.example.jypnote.ui.main.model

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Usage {
    private val id: Int = 0
    private val datetime: String? = null
    private val comment: String? = null
    private val amount: Int = 0
}
