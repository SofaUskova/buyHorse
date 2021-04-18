package com.example.buyHorse.repositories

import com.example.buyHorse.entity.History
import org.springframework.data.repository.CrudRepository

interface HistoryRepository : CrudRepository<History, Long>