package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Gender
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface GenderRepository : CrudRepository<Gender, Int> {

    @Query("SELECT gender.gender FROM Gender gender")
    fun getAllGenders(): List<String>
}