package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Seller
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface SellerRepository : CrudRepository<Seller, Int> {

    @Query("SELECT seller FROM Seller seller WHERE seller.login.login = :login")
    fun getSeller(@Param("login") login: String): Seller

    @Query("SELECT seller FROM Seller seller WHERE seller.idSeller = :idSeller")
    fun getSellerId(@Param("idSeller") idSeller: Int): Seller
}