package com.example.buyHorse.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "gender")
data class Gender(
        @Id
        @Column(name = "id_gender")
        val idGender: Int,
        @Column(name = "gender")
        val gender: String
)
