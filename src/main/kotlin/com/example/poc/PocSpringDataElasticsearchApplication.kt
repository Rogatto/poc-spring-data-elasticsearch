package com.example.poc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocSpringDataElasticsearchApplication

fun main(args: Array<String>) {
	runApplication<PocSpringDataElasticsearchApplication>(*args)
}
