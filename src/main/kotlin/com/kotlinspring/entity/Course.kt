package com.kotlinspring.entity

import javax.persistence.*

/**
 * fileName : Course
 * author :  KimSangHoon
 * date : 2022/10/15
 */
@Entity
@Table(name = "Courses")
data class Course(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,
    var name: String,
    var category: String
)