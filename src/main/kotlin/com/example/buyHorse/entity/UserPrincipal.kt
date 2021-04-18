package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "user_principal")
data class UserPrincipal(
        @Id
        @Column(name = "login")
        val login: String,
        @Column(name = "password")
        val password: String
)
