package com.rxjang.bookery.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@Configuration
@EnableJpaAuditing(modifyOnCreate = false)
class JpaConfig {

    // TODO  AuditorAware<String> 추가 하기
}