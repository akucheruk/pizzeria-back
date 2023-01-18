package com.pizza.domain.topping

data class ToppingRatePair(
        val topping: Topping,
        val rate: Long? = 0L
)
