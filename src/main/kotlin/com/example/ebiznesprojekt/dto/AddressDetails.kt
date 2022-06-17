package com.example.ebiznesprojekt.dto

data class AddressDetails(var email: String,
                          var firstName: String,
                          var lastName: String,
                          var street: String,
                          var buildingNumber: Int,
                          var apartmentNumber: Int,
                          var city: String,
                          var country: String,
                          var phone: Int)