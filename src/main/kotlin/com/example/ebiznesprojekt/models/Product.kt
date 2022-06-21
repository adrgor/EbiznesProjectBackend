package com.example.ebiznesprojekt.models

data class Product (var id: Int, var name: String, var category: String = "Unassigned", var price: Float, var initialProduct: Boolean = true)