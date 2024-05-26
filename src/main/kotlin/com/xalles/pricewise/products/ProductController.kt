package com.xalles.pricewise.products

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// Rest API

@RestController
@RequestMapping("api/products")
class ProductController(@Autowired private val productRepository: ProductRepository) {

    @GetMapping
    fun getAllProducts(): List<Product> =
        productRepository.findAll().toList()

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long): ResponseEntity<Product> {
        val product = productRepository.findById(id).orElse(null)
        return if (product != null) ResponseEntity<Product>(product, HttpStatus.OK)
            else ResponseEntity(HttpStatus.NOT_FOUND)
    }
}