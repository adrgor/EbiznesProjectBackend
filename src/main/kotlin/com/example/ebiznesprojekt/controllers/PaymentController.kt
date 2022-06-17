package com.example.ebiznesprojekt.controllers

import com.example.ebiznesprojekt.dto.CreatePayment
import com.example.ebiznesprojekt.dto.CreatePaymentResponse
import com.stripe.model.PaymentIntent
import com.stripe.param.PaymentIntentCreateParams
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class PaymentController {

    @PostMapping("/create-payment-intent")
    fun createPaymentIntent(@RequestBody createPayment: CreatePayment): CreatePaymentResponse {
        var price = 0.0
        createPayment.basket.forEach { price += it.price }
        val params = PaymentIntentCreateParams.builder()
            .setAmount((price * 100).toLong())
            .setCurrency("usd")
            .setAutomaticPaymentMethods(
                PaymentIntentCreateParams.AutomaticPaymentMethods
                    .builder()
                    .setEnabled(true)
                    .build()
            )
            .build()

        val paymentIntent = PaymentIntent.create(params)

        return CreatePaymentResponse(paymentIntent.clientSecret)
    }
}