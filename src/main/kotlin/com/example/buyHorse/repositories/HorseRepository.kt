package com.example.buyHorse.repositories

import com.example.buyHorse.entity.Horse
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface HorseRepository : CrudRepository<Horse, Long> {

    @Query(value = "SELECT horse.id_horse, horse.id_document, horse.id_image, horse.all_inform, sc.price FROM Horse horse INNER JOIN sales_contract AS sc ON horse.id_document = sc.id_document",
            nativeQuery = true)
    fun getAllHorses(): MutableIterable<Horse>

    @Query(value = "SELECT horse.id_horse, horse.id_document, horse.id_image, horse.all_inform, sc.price FROM Horse horse INNER JOIN sales_contract AS sc ON horse.id_document = sc.id_document WHERE horse.id_horse = :idHorse",
            nativeQuery = true)
    fun getInformHorse(@Param("idHorse") idHorse: Int): Horse

    @Query(value = "SELECT horse.id_horse, horse.id_document, horse.id_image, horse.all_inform, sc.price FROM horse INNER JOIN sales_contract AS sc ON horse.id_document = sc.id_document inner join favorite_horse as fh on fh.favorite_horses_id_horse = horse.id_horse where fh.seller_id_seller = :idSeller",
            nativeQuery = true)
    fun getFavoriteHorses(@Param("idSeller") idSeller: Int): MutableIterable<Horse>
}