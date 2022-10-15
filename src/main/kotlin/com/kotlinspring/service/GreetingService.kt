package com.kotlinspring.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

/**
 * fileName : GreetingsService
 * author :  KimSangHoon
 * date : 2022/10/13
 */
@Service
class GreetingService {

    @Value("\${message}")
    lateinit var message: String

    fun retrieveGreeting(name: String) = "$name, $message"
}