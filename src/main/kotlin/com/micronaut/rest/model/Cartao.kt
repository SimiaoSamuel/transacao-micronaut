package com.micronaut.rest.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Cartao(
    @Id
    val id: String,
    val email: String
)

data class CartaoMessage(
    val id: String,
    val email: String
) {
    fun toModel(): Cartao {
        return Cartao(id = id, email = email)
    }
}

