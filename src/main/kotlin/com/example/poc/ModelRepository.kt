package com.example.poc

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ModelRepository : CrudRepository<Model, UUID>