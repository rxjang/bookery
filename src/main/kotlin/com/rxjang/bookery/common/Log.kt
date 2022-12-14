package com.rxjang.bookery.common

import org.slf4j.Logger
import org.slf4j.LoggerFactory

abstract class Log {
    val logger: Logger = LoggerFactory.getLogger(this.javaClass)
}