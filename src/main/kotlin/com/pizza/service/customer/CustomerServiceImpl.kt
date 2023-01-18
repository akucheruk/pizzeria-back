package com.pizza.service.customer

import com.pizza.domain.customer.Customer
import com.pizza.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(
        private val customerRepository: CustomerRepository
        ) : CustomerService {

    override fun getCustomerByEmail(email: String) = customerRepository.getCustomerByEmail(email)

    override fun createCustomer(email: String) = customerRepository.create(email)

    override fun updateCustomer(customer: Customer) = customerRepository.save(customer)
}