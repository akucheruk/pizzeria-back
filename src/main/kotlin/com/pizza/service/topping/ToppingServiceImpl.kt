package com.pizza.service.topping

import com.pizza.repository.ToppingRepository
import org.springframework.stereotype.Service

@Service
class ToppingServiceImpl(private val toppingRepository : ToppingRepository) : ToppingService {

    override fun getRateOfToppings() = toppingRepository.getRateOfToppings()

}
