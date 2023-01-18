package com.pizza.entity

import com.pizza.dto.Topping
import javax.persistence.*

@Entity
@Table(name = "topping")
data class ToppingEntity (

        @Id
        @GeneratedValue
        val id: Int,

        @Enumerated(EnumType.STRING)
        @Column(name = "topping", nullable = false)
        val topping: Topping,

        @ManyToMany(mappedBy = "toppings")
        val customers: Set<CustomerEntity> = emptySet()

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ToppingEntity

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}