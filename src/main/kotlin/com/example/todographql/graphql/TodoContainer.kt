package com.example.todographql.graphql

import com.example.todographql.application.TodoAppService
import com.example.todographql.application.TodoItemAppService
import com.example.todographql.model.Todo
import com.example.todographql.model.TodoItem
import org.springframework.stereotype.Component

@Component
class TodoContainer(
    private val todoAppService: TodoAppService,
    private val todoItemAppService: TodoItemAppService
){
    fun todo(id: Long): Todo {
        return todoAppService.getTodo(id)
    }

    fun todos(): List<Todo> {
        return todoAppService.getTodos()
    }

    fun todoItems(): List<TodoItem> {
        return todoItemAppService.getItems()
    }
}