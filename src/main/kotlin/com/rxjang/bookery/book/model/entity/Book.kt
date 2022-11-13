package com.rxjang.bookery.book.model.entity

import com.rxjang.bookery.book.model.MallType
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Parameter
import org.hibernate.annotations.Type
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "book")
@EntityListeners(AuditingEntityListener::class)
class Book(
    title: String,
    isbn: String,
    isbn13: String,
    author: String,
    publisher: String,
    publishDate: LocalDateTime,
    description: String,
    mallType: MallType,
    page: Int,
    coverUrl: String,
    deleted: Boolean
) {

    @GenericGenerator(
        name = "bookSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = [
            Parameter(name = "sequence_name", value = "SEQ_BOOK"),
            Parameter(name = "initial_value", value = "1"),
            Parameter(name = "increment_size", value = "1")
        ]
    )
    @Id
    @GeneratedValue(generator = "bookSequenceGenerator")
    val id: Long? = null

    @Column(name = "title")
    var title: String = title
        protected set

    @Column(name = "isbn")
    var isbn: String = isbn
        protected set

    @Column(name = "isbn13")
    var isbn13: String = isbn13
        protected set

    @Column(name = "author")
    var author: String = author
        protected set

    @Column(name = "publisher")
    var publisher: String = publisher
        protected set

    @Column(name = "publish_date")
    var publishDate: LocalDateTime = publishDate
        protected set

    @Column(name = "description")
    var description: String = description
        protected set

    @Column(name = "mall_type")
    var mallType: MallType = mallType
        protected set

    @Column(name = "page")
    var page: Int = page
        protected set

    @Column(name = "coverUrl")
    var coverUrl: String? = coverUrl
        protected set

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.MIN
        protected set

    @LastModifiedDate
    @Column(name = "updated_at", nullable = true)
    var updatedAt: LocalDateTime ?= null
        protected set

    @Column(name = "deleted", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    var deleted: Boolean = deleted
        protected set
}