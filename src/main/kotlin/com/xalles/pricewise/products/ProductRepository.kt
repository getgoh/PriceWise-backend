package com.xalles.pricewise.products

import org.springframework.data.repository.CrudRepository

// This file contains the interface to interact with the database

interface ProductRepository : CrudRepository<Product, Long>