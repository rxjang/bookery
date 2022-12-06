package com.rxjang.bookery.book.web

import com.rxjang.bookery.book.model.dto.AladinSearchResult
import com.rxjang.bookery.book.model.dto.BookSearchRequest
import com.rxjang.bookery.book.service.BookService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/books")
class BookController(
    val bookService: BookService
) {
    @GetMapping
    fun index(): String {

        return "book/index"
    }

    @PostMapping
    @ResponseBody
    fun search(@RequestBody searchRequest: BookSearchRequest): AladinSearchResult? {
        return bookService.search(searchRequest)
    }
}