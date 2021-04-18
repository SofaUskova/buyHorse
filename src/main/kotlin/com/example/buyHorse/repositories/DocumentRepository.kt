package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Document
import org.springframework.data.repository.CrudRepository

interface DocumentRepository : CrudRepository<Document, Long>