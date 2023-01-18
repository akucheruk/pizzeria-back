package com.pizza.repository

import com.pizza.domain.customer.Customer
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class CustomerRepositoryImpl : CustomerRepository {

    override fun getCustomerByEmail(email: String) = Optional.of(
            Customer(
                    UUID.fromString("87361c8d-02b8-4f77-a880-827adcb88143"),
                    email)
    )

    override fun create(email: String) = Customer(UUID.randomUUID(), email)

    override fun save(customer: Customer) = true

}