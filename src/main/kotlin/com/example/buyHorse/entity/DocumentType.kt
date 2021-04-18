package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "doc_type")
data class DocumentType(
        @Id
        @Column(name = "id_doc_type") @GeneratedValue(strategy = GenerationType.AUTO)
        val idDoc: Int,
        @Column(name = "doc_type")
        val docType: String
)
