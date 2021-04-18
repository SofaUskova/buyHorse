package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Color
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ColorRepository : CrudRepository<Color, Int> {

    @Query("SELECT color.color FROM Color color")
    fun getAllColor(): List<String>
}
