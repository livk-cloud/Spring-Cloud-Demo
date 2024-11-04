package com.livk.consumer

import com.livk.stream.entity.StreamMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import reactor.core.publisher.Flux

/**
 * @author livk
 */
@SpringBootApplication
open class KafkaConsumer {
    @Bean
    open fun send(): (Flux<StreamMessage<String>>) -> Unit = { kafkaMessageFlux ->
        kafkaMessageFlux.subscribe { kafkaMessage ->
            log.info(
                "[{}]",
                kafkaMessage
            )
        }
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(KafkaConsumer::class.java)
    }
}

fun main(args: Array<String>) {
    runApplication<KafkaConsumer>(*args)
}
