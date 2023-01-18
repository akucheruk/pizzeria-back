package com.pizza.controller

import com.pizza.domain.exception.CustomerNotPresentException
import com.pizza.domain.topping.Topping
import com.pizza.service.customer.CustomerService
import com.pizza.service.topping.ToppingService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["topping"])
class ToppingController (
        private val toppingService: ToppingService,
        private val customerService: CustomerService) {

    @GetMapping("/rating")
    fun getRateOfToppings() = ResponseEntity.ok(toppingService.getRateOfToppings())

    @PutMapping("/customer/{email}/preferences")
    fun updateCustomerToppingPreferences(
            @PathVariable("email") email: String,
            @RequestBody toppings: Set<Topping>): ResponseEntity.HeadersBuilder<*> {
        val customer = customerService.getCustomerByEmail(email)
                .orElseThrow { CustomerNotPresentException("Not find customer by email: $email!") }

        customer.toppings = toppings

        return if (customerService.updateCustomer(customer))
            ResponseEntity.noContent()
            else ResponseEntity.internalServerError()
    }

}
