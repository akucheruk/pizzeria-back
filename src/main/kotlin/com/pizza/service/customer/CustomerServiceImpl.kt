package com.pizza.service.customer

import com.pizza.exception.CustomerNotPresentException
import com.pizza.dto.Topping
import com.pizza.repository.CustomerRepository
import com.pizza.repository.ToppingRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class CustomerServiceImpl(
        private val customerRepository: CustomerRepository,
        private val toppingRepository: ToppingRepository
        ) : CustomerService {

    @Transactional
    override fun saveCustomer(email: String, toppings: Set<Topping>) {
        val customer = customerRepository.findByEmail(email)
                ?: throw CustomerNotPresentException("Not find customer by email: $email!")

        val toppingEntities = toppingRepository.findByTopping(toppings)
        customer.toppings = toppingEntities
        customerRepository.save(customer)
    }
}