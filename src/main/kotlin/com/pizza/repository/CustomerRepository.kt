package com.pizza.repository

import com.pizza.domain.customer.Customer
import java.util.Optional

interface CustomerRepository {

    fun getCustomerByEmail(email: String) : Optional<Customer>

    fun create(email : String) : Customer

    fun save(customer : Customer) : Boolean
}