package com.micronaut.rest.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Estabelecimento(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    val nome: String,
    val cidade: String,
    val endereco: String
)

data class EstabelecimentoMessage(
    val idEstabelecimento: Long,
    val nome: String,
    val cidade: String,
    val endereco: String
) {
    fun toModel(): Estabelecimento {
        return Estabelecimento(nome = nome, cidade = cidade, endereco = endereco)
    }
}