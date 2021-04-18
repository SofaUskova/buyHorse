package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Location
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LocationRepository : CrudRepository<Location, Long> {

    @Query("SELECT location.city FROM Location location" )
    fun getAllCity(): List<String>
}