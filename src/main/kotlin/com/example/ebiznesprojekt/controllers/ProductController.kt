package com.example.ebiznesprojekt.controllers

import com.example.ebiznesprojekt.dao.ProductDao
import com.example.ebiznesprojekt.models.Product
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class ProductController {

    @GetMapping("/api/products")
    fun getProducts(): List<Product> {
        return ProductDao.getAllProducts()
    }

    @GetMapping("/api/products/{id}")
    fun getProductById(@PathVariable id: Int): Product {
        return ProductDao.getProductById(id)
    }

    @GetMapping("/api/products/initial")
    fun getInitialProducts(): List<Product> {
        return ProductDao.getInitialProducts()
    }

    @GetMapping("/api/products/not-initial")
    fun getNotInitialProducts(): List<Product> {
        return ProductDao.getNotInitialProducts()
    }

    @PostMapping("/api/products")
    fun addProduct(@RequestBody product: Product) {
        ProductDao.addProduct(product)
    }

    @DeleteMapping("/api/products/{id}")
    fun deleteProductById(@PathVariable id: Int) {
        ProductDao.removeProductById(id)
    }

    @PutMapping("/api/products")
    fun editProduct(@RequestBody product: Product) {
        ProductDao.editProduct(product)
    }
}