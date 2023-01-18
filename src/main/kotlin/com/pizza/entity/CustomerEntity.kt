package com.pizza.entity

import javax.persistence.*

@Entity
@Table(name = "customer")
data class CustomerEntity (

    @Id
    @GeneratedValue
    val id: Int,

    @Column(nullable = false)
    val email: String,

    @ManyToMany(cascade = [ CascadeType.ALL ])
    @JoinTable(
            name = "customer_topping",
            joinColumns = [ JoinColumn(name = "customer_id") ],
            inverseJoinColumns = [ JoinColumn(name = "topping_id") ]
    )
    var toppings: Set<ToppingEntity> = emptySet()


) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CustomerEntity

        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        return email.hashCode()
    }
}