package com.example.todographql.graphql

import com.example.todographql.application.TodoAppService
import com.example.todographql.application.TodoItemAppService
import com.example.todographql.model.Todo
import com.example.todographql.model.TodoItem
import com.example.todographql.model.input.TodoItemParam
import com.example.todographql.model.input.TodoParam
import com.expediagroup.graphql.server.operations.Mutation
import org.springframework.stereotype.Component

@Component
class TodoMutation (
    val todoAppService: TodoAppService,
    val todoItemAppService: TodoItemAppService
): Mutation {
    fun saveTodo(param: TodoParam): Todo {
        return todoAppService.save(param)
    }

    fun saveTodoItem(param: TodoItemParam): TodoItem {
        return todoItemAppService.save(param)
    }
}