package com.pizza.service.topping

import com.pizza.dto.ToppingRatePair
import com.pizza.repository.ToppingRepository
import org.springframework.stereotype.Service

@Service
class ToppingServiceImpl(private val toppingRepository : ToppingRepository) : ToppingService {

    override fun getRateOfToppings(): Set<ToppingRatePair?> {
        return toppingRepository.findAll()
                .asSequence()
                .map { ToppingRatePair(it.topping, it.customers.size) }
                .toSet()
    }

}
