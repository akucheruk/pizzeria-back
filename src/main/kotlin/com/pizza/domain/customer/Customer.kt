package com.pizza.domain.customer

import com.pizza.domain.topping.Topping
import java.util.UUID

data class Customer(
        val id : UUID,
        val email : String,
        var toppings: Set<Topping>? = emptySet()
)
