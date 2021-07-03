package br.com.todo.web.controllers

import io.micronaut.http.HttpStatus
import io.micronaut.http.HttpResponse
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class TodoControllerTest {
    @Inject
    lateinit var todoController: TodoController

    @Test
    @DisplayName("Deve retornar 200")
    fun testaSeAConsultaRetorna200() {
        var response: HttpResponse<Any> = todoController.index()

        assertEquals(HttpStatus.OK, response.status())
    }
}