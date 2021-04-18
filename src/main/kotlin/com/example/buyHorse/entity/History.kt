package com.example.buyHorse.entity

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "history")
data class History(
        @Id
        @Column(name = "id_history") @GeneratedValue(strategy = GenerationType.AUTO)
        val idHistory: Int,
        @ManyToOne
        @JoinColumn(name = "id_horse")
        val idHorse: Horse,
        @ManyToOne
        @JoinColumn(name = "id_seller")
        val idSeller: Seller,
        @Column(name = "date_buy")
        val dateBuy: Date,
)
