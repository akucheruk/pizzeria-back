package com.pizza.controller

import com.pizza.dto.Topping
import com.pizza.service.customer.CustomerService
import com.pizza.service.topping.ToppingService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["topping"])
class ToppingController (
        private val toppingService: ToppingService,
        private val customerService: CustomerService) {

    @GetMapping("/rating")
    fun getRateOfToppings() = ResponseEntity.ok(toppingService.getRateOfToppings())

    @PutMapping("/customer/{email}/preferences")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun updateCustomerToppingPreferences(
            @PathVariable("email") email: String,
            @RequestBody toppings: Set<Topping>) = customerService.saveCustomer(email, toppings)

}
