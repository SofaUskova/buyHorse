package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Image
import org.springframework.data.repository.CrudRepository

interface ImageRepository : CrudRepository<Image, Long>