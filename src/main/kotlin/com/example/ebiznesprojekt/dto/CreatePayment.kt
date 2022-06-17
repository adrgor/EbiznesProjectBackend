package com.example.ebiznesprojekt.dto

import com.google.gson.annotations.SerializedName

class CreatePayment {

    @SerializedName("basket")
    var basket: Array<Item> = arrayOf()

    @SerializedName("addressDetails")
    var addressDetails: AddressDetails? = null

    override fun toString(): String {
        var response = "{Basket: "
        basket.forEach { response = response + it + "\n" }
        response += "Address Details + $addressDetails\n}"
        return response
    }
}
