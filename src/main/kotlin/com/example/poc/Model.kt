package com.example.poc

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import java.math.BigDecimal
import java.util.*

@Document(indexName = "my-index-name")
data class Model(

    @Id
    private val id: UUID = UUID.randomUUID(),

    @Field
    private val name: String,

    @Field
    private val summary: String,

    @Field
    private val price: BigDecimal

)