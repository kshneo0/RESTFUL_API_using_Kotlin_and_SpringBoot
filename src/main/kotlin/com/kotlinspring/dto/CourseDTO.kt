package com.kotlinspring.dto

import javax.validation.constraints.NotBlank

/**
 * fileName : CourseDTO
 * author :  KimSangHoon
 * date : 2022/10/15
 */
data class CourseDTO(
    val id: Int?,
    @get:NotBlank(message = "courseDTO.name must not be blank")
    val name: String,
    @get:NotBlank(message = "courseDTO.category must not be blank")
    val category: String,

    )