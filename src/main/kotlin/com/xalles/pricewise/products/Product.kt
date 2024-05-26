package com.xalles.pricewise.products

import jakarta.persistence.*

@Entity
@Table(name = "products")
data class Product (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val sku: String,
    val name: String,
    val price: Double,
    val currency: String,
    val source: String  // thinking "source" here is the establishment where the product is found
)