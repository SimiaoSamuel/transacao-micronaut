package com.micronaut.rest.model

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Transacao(
    @Id
    val id: String = "",
    val valor: BigDecimal,
    @field:ManyToOne
    val estabelecimento: Estabelecimento,
    @field:ManyToOne
    val cartao: Cartao,
    val efetivadaEm: LocalDateTime
)

data class TransacaoMessage(
    val id: String,
    val valor: BigDecimal,
    val estabelecimento: EstabelecimentoMessage,
    val cartao: CartaoMessage,
    val efetivadaEm: LocalDateTime
){
    fun toModel(): Transacao {
        return Transacao(
            id = id,
            valor = valor,
            estabelecimento = estabelecimento.toModel(),
            cartao = cartao.toModel(),
            efetivadaEm = efetivadaEm
        )
    }
}