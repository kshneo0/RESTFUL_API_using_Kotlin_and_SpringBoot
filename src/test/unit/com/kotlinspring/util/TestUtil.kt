package com.kotlinspring.util

import com.kotlinspring.entity.Course

/**
 * fileName : TestUtil
 * author :  KimSangHoon
 * date : 2022/10/15
 */
fun courseEntityList() = listOf(
    Course(
        null,
        "Build RestFul APis using SpringBoot and Kotlin", "Development"
    ),
    Course(
        null,
        "Build Reactive Microservices using Spring WebFlux/SpringBoot", "Development",
    ),
    Course(
        null,
        "Wiremock for Java Developers", "Development",
    )
)