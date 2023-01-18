package com.pizza.repository

import com.pizza.dto.Topping
import com.pizza.entity.ToppingEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ToppingRepository : CrudRepository<ToppingEntity, Topping> {

    @Query("SELECT t FROM ToppingEntity t WHERE t.topping IN (:toppings)")
    fun findByTopping(@Param("toppings") toppings: Set<Topping>): Set<ToppingEntity>

}