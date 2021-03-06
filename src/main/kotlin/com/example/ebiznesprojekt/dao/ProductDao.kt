package com.example.ebiznesprojekt.dao

import com.example.ebiznesprojekt.models.Product
import kotlin.streams.toList

object ProductDao {
    val PHONES_CATEGORY = "Smartfony i telefony"
    val MONITOR_CATEGORY = "Monitory"
    val COMPUTER_CATEGORY = "Komputery"
    val CONSOLE_CATEGORY = "Konsole"

    var products = mutableListOf<Product>(
        Product(1, "Xiaomi Redmi Note 11 4/64GB Twilight Blue", PHONES_CATEGORY, 899.00f),
        Product(2, "Dell P2422H", MONITOR_CATEGORY, 1099.99f),
        Product(3, "Huawei MateBook D 15-R5-5500U/8GB/512/Win11", COMPUTER_CATEGORY, 2999.00f),
        Product(4, "Xiaomi Redmi 9A 2/32GB", PHONES_CATEGORY, 399.00f),
        Product(5, "Philips 50PUS8546", MONITOR_CATEGORY, 2999.00f),
        Product(6, "Nintendo Switch", CONSOLE_CATEGORY, 1349.00f),
        Product(7, "Acer Nitro VG240YBMIIX", MONITOR_CATEGORY, 649.00f),
        Product(8, "Dell Inspiron 5515 Ryzen 5 5500U/16GB/512/Win11", COMPUTER_CATEGORY, 3399.00f),
        Product(9, "Apple MacBook Air M1/8GB/256", COMPUTER_CATEGORY, 4599.00f),
        Product(10,"realme 8 4+64GB", PHONES_CATEGORY, 999.00f),
    )

    var indexCounter = 10

    fun getAllProducts(): List<Product> {
        return products
    }

    fun getNotInitialProducts(): List<Product> {
        return products.stream().filter { product -> !product.initialProduct }.toList()
    }

    fun getInitialProducts(): List<Product> {
        return products.stream().filter { product -> product.initialProduct }.toList()
    }

    fun getProductById(id: Int): Product {
        return products.first { p -> p.id == id }
    }

    fun addProduct(product: Product) {
        indexCounter++
        product.id = indexCounter
        product.initialProduct = false
        products.add(product)
    }

    fun removeProductById(id: Int) {
        var removeIndex: Int = -1
        for(i in products.indices) {
            if(products[i].id == id) {
                removeIndex = i
            }
        }
        products.removeAt(removeIndex)
        println(products)
    }

    fun editProduct(product: Product) {
        for (i in products.indices) {
            if(products[i].id == product.id) {
                product.initialProduct = false
                products[i] = product
            }
        }
    }
}