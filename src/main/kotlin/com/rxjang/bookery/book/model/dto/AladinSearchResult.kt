package com.rxjang.bookery.book.model.dto

data class AladinSearchResult(
    val version: String,
    val title: String,
    val link: String,
    val pubDate: String, // 검색일
    val imageUrl: String,
    val totalResults: Int,
    val startIndex: Int,
    val itemsPerPage: Int,
    val query: String,
    val searchCategoryId: Int,
    val searchCategoryName: String,
    val item: MutableList<AladinBookItem>,
)
