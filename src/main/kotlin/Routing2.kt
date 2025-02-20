package com.example

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.configureRouting1(){
    routing{
        get("/task"){
            call.respondText(
                contentType = ContentType.parse("text/html"),
                text = """
                    <h3> TODO: </h3>
                    <ol>
                        <li>A table of all the tasks</li>
                        <li>A form to submit new tasks</li>
                    </ol>
                """.trimIndent()

            )

        }
    }
}