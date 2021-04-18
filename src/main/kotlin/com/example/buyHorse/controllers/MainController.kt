package com.example.buyHorse.controllers

import com.example.buyHorse.entity.*
import com.example.buyHorse.repositories.*
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/db", produces = [MediaType.APPLICATION_JSON_VALUE])
class MainController(private val horseRepository: HorseRepository,
                     private val locationRepository: LocationRepository,
                     private val breedRepository: BreedRepository,
                     private val sellerRepository: SellerRepository,
                     private val colorRepository: ColorRepository,
                     private val documentRepository: DocumentRepository,
                     private val userPrincipalRepository: UserPrincipalRepository,
                     private val salesContractRepository: SalesContractRepository
) {

    @GetMapping(path = ["/entry/{login}"])
    fun findInformHorse(@PathVariable("login") login: String): UserPrincipal = userPrincipalRepository.entry(login)

    @GetMapping(path = ["/seller/{login}"])
    fun findSeller(@PathVariable("login") login: String) = sellerRepository.getSeller(login)

    @PostMapping(path = ["/addUser"])
    fun addUser(@RequestBody user: UserPrincipal) = userPrincipalRepository.save(user)

    @PostMapping(path = ["/addSeller"])
    fun addSeller(@RequestBody seller: Seller) = sellerRepository.save(seller)

    @GetMapping(path = ["/allHorses"])
    fun findAllHorses(): MutableIterable<Horse> = horseRepository.getAllHorses()

    @GetMapping(path = ["/allDocuments"])
    fun findAllDoc(): MutableIterable<Document> = documentRepository.findAll()

    @GetMapping(path = ["/informHorse/{idHorse}"])
    fun findInformHorse(@PathVariable("idHorse") idHorse: Int): Horse = horseRepository.getInformHorse(idHorse)

    @GetMapping(path = ["/sellerId/{idSeller}"])
    fun findSellerId(@PathVariable("idSeller") idSeller: Int) = sellerRepository.getSellerId(idSeller)

    @GetMapping(path = ["/favoriteHorses/{idSeller}"])
    fun findFavoriteHorses(@PathVariable("idSeller") idSeller: Int): MutableIterable<Horse> =
            horseRepository.getFavoriteHorses(idSeller)

    @PostMapping(path = ["/addDocument"])
    fun addDocument(@RequestBody document: Document) =
            documentRepository.save(document)

    @PostMapping(path = ["/addSalesContract"])
    fun addSalesContract(@RequestBody salesContract: SalesContract) =
            salesContractRepository.save(salesContract)

    @PostMapping(path = ["/addHorse"])
    fun addHorse(@RequestBody horse: Horse) =
            horseRepository.save(horse)
    
    //////////////////////// запросы для списков ////////////////////////

    @GetMapping(path = ["/allBreeds"])
    fun findAllBreeds() = breedRepository.getAllBreed()

    @GetMapping(path = ["/allColors"])
    fun findAllColors() = colorRepository.getAllColor()

    @GetMapping(path = ["/allCities"])
    fun findAllCities() = locationRepository.getAllCity()
}