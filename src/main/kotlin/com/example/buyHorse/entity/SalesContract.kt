package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "sales_contract")
data class SalesContract(
        @Id
        @Column(name = "id_sales_contract") @GeneratedValue(strategy = GenerationType.AUTO)
        val idSalesContract: Int,
        @Column(name = "price")
        val price: String,
        @ManyToOne
        @JoinColumn(name = "id_seller")
        val seller: Seller,
        @ManyToOne
        @JoinColumn(name = "id_document")
        val objectOfSales: Document
)
