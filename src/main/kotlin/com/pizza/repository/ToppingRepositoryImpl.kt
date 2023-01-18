package com.pizza.repository

import com.pizza.domain.topping.Topping
import com.pizza.domain.topping.ToppingRatePair
import org.springframework.stereotype.Repository

@Repository
class ToppingRepositoryImpl : ToppingRepository {

    override fun getRateOfToppings() = setOf(
            ToppingRatePair(Topping.CHEESE, 12),
            ToppingRatePair(Topping.TOMATO, 9),
            ToppingRatePair(Topping.SAUSAGES, 8)
    )

}
