package com.example.ebiznesprojekt

import com.example.ebiznesprojekt.configuration.AppProperties
import com.stripe.Stripe
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppProperties::class)
class EbiznesProjektApplication

fun main(args: Array<String>) {
	Stripe.apiKey = "sk_test_51LBGY5CG5ft7NspYQp6U2emLYtMV8mTL9kcyK5QrvUJi31ORCCssbYt9kLCFlKRUs42NdATOyXvpvqC25SOWzlnC00Kd3O4LuI"
	runApplication<EbiznesProjektApplication>(*args)
}
