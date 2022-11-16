package com.rxjang.bookery.book.model.dto

data class AladinSearchRequest(
    val ttbKey: String,
    var Query: String,
    var QueryType: String = "Title",
    var start: Int = 1,
    var SearchTarget: String = "Book",
) {
    val MaxResults = 10
    val output = "js"
    val Version = "20131101"
}
