package com.pizza.service.customer

import com.pizza.dto.Topping

interface CustomerService {

    fun saveCustomer(email: String, toppings: Set<Topping>)
}