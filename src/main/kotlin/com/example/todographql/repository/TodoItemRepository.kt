package com.example.todographql.repository

import com.example.todographql.model.TodoItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoItemRepository: JpaRepository<TodoItem, Long> {
    fun findAllByTodoId(todoId: Long): List<TodoItem>
}