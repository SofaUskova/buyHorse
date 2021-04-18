package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "roles")
data class Roles(
        @Id
        @Column(name = "id_roles") @GeneratedValue(strategy = GenerationType.AUTO)
        val idRoles: Int,
        @Column(name = "type_roles")
        val typeRoles: String
)
