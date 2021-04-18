package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "location")
data class Location(
        @Id
        @Column(name = "id_location")
        val idLocation: Int? = null,
        @Column(name = "country")
        val country: String? = null,
        @Column(name = "city")
        val city: String? = null
)