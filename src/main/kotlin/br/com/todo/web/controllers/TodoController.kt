package br.com.todo.web.controllers

import br.com.todo.domain.entities.Todo
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/todo/v1/todo")
class TodoController {

    @Get(produces = [MediaType.APPLICATION_JSON])
    fun index(): HttpResponse<Any> {
        return HttpResponse.ok(Todo(null, "Viajar", true))
    }
}

