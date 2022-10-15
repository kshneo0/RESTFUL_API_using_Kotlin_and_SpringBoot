package com.kotlinspring.repository

import com.kotlinspring.entity.Course
import org.springframework.data.repository.CrudRepository

/**
 * fileName : CourseRepository
 * author :  KimSangHoon
 * date : 2022/10/15
 */
interface CourseRepository:CrudRepository<Course, Int> {
}