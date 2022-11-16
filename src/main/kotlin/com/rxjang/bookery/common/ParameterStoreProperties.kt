package com.rxjang.bookery.common

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class ParameterStoreProperties {

    companion object {
        lateinit var ALADIN_KEY: String
    }

    @Value("\${aladin.key}")
    fun setAladinKey(aladinKey: String) {
        ALADIN_KEY = aladinKey
    }
}