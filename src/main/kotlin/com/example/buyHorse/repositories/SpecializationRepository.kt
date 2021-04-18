package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Gender
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SpecializationRepository : CrudRepository<Gender, Int> {

    @Query("SELECT spec.typeSpecialization FROM Specialization spec")
    fun getAllSpecializations(): List<String>
}