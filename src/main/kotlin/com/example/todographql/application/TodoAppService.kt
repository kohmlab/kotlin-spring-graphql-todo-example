package com.example.todographql.application

import com.example.todographql.model.Todo
import com.example.todographql.model.input.TodoParam
import com.example.todographql.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoAppService(
    private val todoRepository: TodoRepository
) {
    fun getTodo(id: Long): Todo {
        return todoRepository.findById(id).get()
    }

    fun getTodos(): List<Todo> {
        return todoRepository.findAll()
    }

    fun save(param: TodoParam): Todo {
        val todo = Todo(title = param.title)
        return todoRepository.save(todo)
    }
}