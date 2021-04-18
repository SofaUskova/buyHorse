package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "specialization")
data class Specialization(
        @Id @Column(name = "id_specialization") @GeneratedValue(strategy = GenerationType.AUTO)
        val idSpecialization: Int,
        @Column(name = "type_specialization")
        val typeSpecialization: String
)
