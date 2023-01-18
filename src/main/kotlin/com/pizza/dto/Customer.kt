package com.pizza.dto

import com.pizza.entity.CustomerEntity

class Customer(customerEntity: CustomerEntity) {
    val email: String = customerEntity.email
    var topping: Set<Topping> = customerEntity.toppings
            .asSequence()
            .map { it.topping }
            .toSet()
}