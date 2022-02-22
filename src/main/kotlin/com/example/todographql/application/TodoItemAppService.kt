package com.example.todographql.application

import com.example.todographql.model.TodoItem
import com.example.todographql.model.input.TodoItemParam
import com.example.todographql.repository.TodoItemRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TodoItemAppService(
    val todoItemRepository: TodoItemRepository
) {
    fun findAllByTodoId(todoId: Long): List<TodoItem> {
        return todoItemRepository.findAllByTodoId(todoId)
    }

    fun getItems(): List<TodoItem> {
        return todoItemRepository.findAll()
    }

    fun save(param: TodoItemParam): TodoItem {
        val todoItem = TodoItem(item = param.item, todoId = param.todoId)
        return todoItemRepository.save(todoItem)
    }
}