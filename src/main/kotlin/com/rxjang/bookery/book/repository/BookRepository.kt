package com.rxjang.bookery.book.repository

import com.rxjang.bookery.book.model.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book, Long> {
}