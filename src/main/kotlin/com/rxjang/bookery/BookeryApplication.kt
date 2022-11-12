package com.rxjang.bookery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookeryApplication

fun main(args: Array<String>) {
    runApplication<BookeryApplication>(*args)
}
