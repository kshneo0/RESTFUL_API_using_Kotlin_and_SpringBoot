package com.kotlinspring.dto

import javax.validation.constraints.NotBlank

/**
 * fileName : InstructorDTO
 * author :  KimSangHoon
 * date : 2022/10/15
 */


data class InstructorDTO(
    val id: Int?,
    @get:NotBlank(message = "instructorDTO.name must not be blank")
    val name: String
)