package com.rxjang.bookery.book.web

import com.rxjang.bookery.book.service.BookService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/books")
class BookController(
    val bookService: BookService
) {

    @GetMapping
    fun search(): String {
        bookService.search("토지")
        return "book/index"
    }
}