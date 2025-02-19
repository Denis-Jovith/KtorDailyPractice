package com.example

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    install(StatusPages) {
        exception<IllegalStateException> { call, cause ->
            call.respond(HttpStatusCode.InternalServerError, "App in illegal state: ${cause.message}")
        }
    }
    routing {
        staticResources("/content", "mycontent")

        get("/") {
            call.respondText("Hello World!")
        }

        get("/error-test") {
            throw IllegalStateException("Too Busy")
        }

        get("/test1") {
            val text = "<h1>Hello From Tanzania Ktor</h1>"
            val type = ContentType.Text.Html
            call.respondText(text, type)
        }
    }
}
