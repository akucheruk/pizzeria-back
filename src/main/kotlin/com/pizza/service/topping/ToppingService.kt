package com.pizza.service.topping

import com.pizza.domain.topping.ToppingRatePair

interface ToppingService {

    fun getRateOfToppings(): Set<ToppingRatePair>

}
