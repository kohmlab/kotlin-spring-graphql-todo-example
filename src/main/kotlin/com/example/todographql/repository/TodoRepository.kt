package com.example.todographql.repository

import com.example.todographql.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository: JpaRepository<Todo, Long>