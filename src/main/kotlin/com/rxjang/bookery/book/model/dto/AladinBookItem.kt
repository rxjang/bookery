package com.rxjang.bookery.book.model.dto

import com.rxjang.bookery.book.model.MallType
import java.time.LocalDate

data class AladinBookItem(
    val title: String,
    val link: String,
    val author: String,
    val putDate: LocalDate,
    val description: String,
    val creator: String,
    val isbn: String,
    val isbn13: String,
    val itemId: Int,
    val priceSales: Int, // 판매가
    val priceStandard: Int, // 정가
    val stockStatus: String,
    val mileage: Int,
    val cover: String,
    val categoryId: Int,
    val categoryName: String,
    val publisher: String,
    val customerReviewRank: Int,

    val mallType: MallType,
    val salesPoint: Int,
    val adult: Boolean,
    val fixedPrice: Boolean,
    val bestDuration: String,
    val bestRank: Int,


)