package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "image")
data class Image(
        @Id
        @Column(name = "id_image") @GeneratedValue(strategy = GenerationType.AUTO)
        val idImage: Int,
        @Column(name = "url")
        val url: String
)
