package com.rxjang.bookery.book.model.dto

data class BookSearchRequest(
    val category: String,
    val keyword: String
)
