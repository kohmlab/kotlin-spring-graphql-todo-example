package com.example.todographql.model

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import javax.persistence.*

@Entity
class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLDescription("Todo id")
    var id: Long = 0L,

    @GraphQLDescription("Todo 제목")
    var title: String,
) {
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "todoId")
    var items: List<TodoItem>? = emptyList()
}