package com.example.buyHorse.entity

import javax.persistence.*

@Entity
@Table(name = "document")
data class Document(
        @Id
        @Column(name = "id_document") @GeneratedValue(strategy = GenerationType.AUTO)
        val idDocument: Int,
        @Column(name = "name")
        val name: String,
        @Column(name = "height")
        val height: String,
        @Column(name = "year_birth")
        val yearBirth: String,
        @Column(name = "organization")
        val organization: String,
        @Column(name = "brand")
        val brand: String?,
        @Column(name = "marks")
        val marks: String,
        @Column(name = "mother", nullable = true)
        val mother: String?,
        @Column(name = "father", nullable = true)
        val father: String?,
        @ManyToOne
        @JoinColumn(name = "id_breed")
        val breed: Breed,
        @ManyToOne
        @JoinColumn(name = "id_color")
        val color: Color,
        @ManyToOne
        @JoinColumn(name = "id_gender")
        val gender: Gender,
        @ManyToOne
        @JoinColumn(name = "id_location")
        val location: Location,
        @ManyToOne
        @JoinColumn(name = "id_doc_type")
        val docType: DocumentType
)
