package com.kotlinspring.entity

import javax.persistence.*

/**
 * fileName : Instructor
 * author :  KimSangHoon
 * date : 2022/10/15
 */
@Entity
@Table(name = "INSTRUCTORS")
data class Instructor(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int?,
    var name: String,
    @OneToMany(
        mappedBy = "instructor",
        cascade = [CascadeType.ALL],
        orphanRemoval = true
    )
    var courses: List<Course> = mutableListOf()
)