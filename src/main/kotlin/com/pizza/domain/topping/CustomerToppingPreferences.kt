package com.pizza.domain.topping

data class CustomerToppingPreferences(
        val email: String,
        val toppings: Set<Topping>
)
