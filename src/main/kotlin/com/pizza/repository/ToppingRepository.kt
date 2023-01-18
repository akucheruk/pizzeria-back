package com.pizza.repository

import com.pizza.domain.topping.ToppingRatePair

interface ToppingRepository {

    fun getRateOfToppings() : Set<ToppingRatePair>

}