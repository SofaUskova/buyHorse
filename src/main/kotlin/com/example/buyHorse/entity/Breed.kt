package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "breed")
data class Breed(
        @Id @Column(name = "id_breed") @GeneratedValue(strategy = GenerationType.AUTO)
        val idBreed: Int,
        @Column(name = "breed")
        val breed: String
)
