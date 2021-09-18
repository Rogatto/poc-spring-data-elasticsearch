package com.example.poc

import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextStartedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class ApplicationTest(private val modelRepository: ModelRepository) : ApplicationListener<ApplicationReadyEvent> {

    private val log = LoggerFactory.getLogger(this::class.java)

    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        val model = Model(
            name = "Fundamentals of Software Architecture: An Engineering Approach",
            summary = """
                Salary surveys worldwide regularly place software architect in the top 10 best jobs, 
                yet no real guide exists to help developers become architects. 
                Until now. This book provides the first comprehensive overview of software architecture's many aspects. 
                Aspiring and existing architects alike will examine architectural characteristics, 
                architectural patterns, component determination, diagramming and presenting architecture, 
                evolutionary architecture, and many other topics.
            """.trimIndent(),
            price = BigDecimal.valueOf(337.44)
        )

        log.info("Creating $model")
        this.modelRepository.save(model)

    }

}