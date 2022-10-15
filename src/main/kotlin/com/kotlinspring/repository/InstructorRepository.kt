package com.kotlinspring.repository

import com.kotlinspring.entity.Instructor
import org.springframework.data.repository.CrudRepository

/**
 * fileName : InstructorRepository
 * author :  KimSangHoon
 * date : 2022/10/15
 */
interface InstructorRepository : CrudRepository<Instructor, Int> {
    fun findInstructorByName(name: String): Instructor
}