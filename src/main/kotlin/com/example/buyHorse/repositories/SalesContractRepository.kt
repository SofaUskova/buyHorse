package com.example.buyHorse.repositories

import com.example.buyHorse.entity.SalesContract
import org.springframework.data.repository.CrudRepository

interface SalesContractRepository : CrudRepository<SalesContract, Long>