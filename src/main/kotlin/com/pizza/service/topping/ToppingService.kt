package com.pizza.service.topping

import com.pizza.dto.ToppingRatePair

interface ToppingService {

    fun getRateOfToppings(): Set<ToppingRatePair?>

}
