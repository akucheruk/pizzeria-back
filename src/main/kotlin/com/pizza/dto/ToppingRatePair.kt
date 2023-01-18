package com.pizza.dto

data class ToppingRatePair (
        val topping: Topping,
        val rate: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ToppingRatePair

        if (topping != other.topping) return false

        return true
    }

    override fun hashCode(): Int {
        return topping.hashCode()
    }
}
