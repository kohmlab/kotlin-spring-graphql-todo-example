package com.example.todographql.graphql

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class TodoQuery(
    private val todoContainer: TodoContainer
): Query {
    fun todo() = todoContainer
}
