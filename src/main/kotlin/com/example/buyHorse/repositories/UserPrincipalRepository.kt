package com.example.buyHorse.repositories

import com.example.buyHorse.entity.UserPrincipal
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface UserPrincipalRepository : CrudRepository<UserPrincipal, Long> {

    @Query("SELECT user FROM UserPrincipal user WHERE user.login = :login")
    fun entry(@Param("login") login: String): UserPrincipal
}