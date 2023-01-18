package com.pizza.service.customer

import com.pizza.domain.customer.Customer
import java.util.Optional

interface CustomerService {

    fun getCustomerByEmail(email: String) : Optional<Customer>

    fun createCustomer(email: String) : Customer

    fun updateCustomer(customer: Customer) : Boolean
}