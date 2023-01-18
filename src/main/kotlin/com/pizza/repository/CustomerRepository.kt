package com.pizza.repository

import com.pizza.entity.CustomerEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CustomerRepository : CrudRepository<CustomerEntity, UUID> {

    fun findByEmail(email: String): CustomerEntity?

}