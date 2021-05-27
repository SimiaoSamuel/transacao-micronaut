package com.micronaut.rest

import com.micronaut.rest.model.Transacao
import com.micronaut.rest.model.TransacaoMessage
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton
import javax.persistence.EntityManager

/**
 * kafka-streams requires at least one listener
 */
@KafkaListener(groupId = "Listener")
class Listener {

    private val log: Logger = LoggerFactory.getLogger(Listener::class.java)

    @Topic("transacoes")
    fun example(transacao: TransacaoMessage) {
        log.info(transacao.toString())
    }
}