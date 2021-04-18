package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "horse")
data class Horse(
        @Id
        @Column(name = "id_horse") @GeneratedValue(strategy = GenerationType.TABLE)
        val idHorse: Int,
        @ManyToOne
        @JoinColumn(name = "id_document")
        val document: Document,
        @ManyToOne
        @JoinColumn(name = "id_image")
        val image: Image?,
        @Column(name = "all_inform")
        val allInform: String?,
        @Column(name = "price")
        val price: String
)
