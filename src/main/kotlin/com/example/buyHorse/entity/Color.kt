package com.example.buyHorse.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "color")
data class Color(
        @Id
        @Column(name = "id_color")
        val idColor: Int,
        @Column(name = "color")
        val color: String
)
