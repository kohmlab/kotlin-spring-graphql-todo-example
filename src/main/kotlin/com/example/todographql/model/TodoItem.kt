package com.example.todographql.model

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.generator.annotations.GraphQLIgnore
import javax.persistence.*

@Entity
@Embeddable
data class TodoItem (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLDescription("TodoItem id")
    var id: Long = 0L,

    @GraphQLIgnore
    var todoId: Long,

    @GraphQLDescription("TodoItem")
    var item: String,
)