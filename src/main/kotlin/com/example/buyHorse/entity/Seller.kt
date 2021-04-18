package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "seller")
data class Seller(
        @Id
        @Column(name = "id_seller")
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val idSeller: Int,
        @Column(name = "name")
        val name: String,
        @Column(name = "phone")
        val phone: String,
        @ManyToOne
        @JoinColumn(name = "id_location")
        val location: Location,
        @ManyToOne
        @JoinColumn(name = "login")
        val login: UserPrincipal,
        @ManyToOne
        @JoinColumn(name = "id_image")
        val image: Image?,
        @ManyToMany
        @JoinTable(name = "favorite_horse")
        val favoriteHorses: List<Horse>?
)
