package com.example

import com.example.com.example.model.Priority
import com.example.com.example.model.Task
import com.example.com.example.model.TaskRepository
import com.example.com.example.model.taskAsTable
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.configureRouting1(){
    routing{
        staticResources("/task-ui","task-ui")

        get("/task"){
            val tasks = TaskRepository.allTasks()
            call.respondText(
                contentType = ContentType.parse("text/html"),
//                text = """
//                    <h3> TODO: </h3>
//                    <ol>
//                        <li>A table of all the tasks</li>
//                        <li>A form to submit new tasks</li>
//                    </ol>
//                """.trimIndent()
                text = tasks.taskAsTable()
            )
        }
        get("/tasks/byPriority/{priority}"){
            val priorityAsText = call.parameters["priority"]
            if (priorityAsText == null) {
                call.respond(HttpStatusCode.BadRequest)
                return@get
            }

            try {
                val priority = Priority.valueOf(priorityAsText)
                val tasks = TaskRepository.tasksByPriority(priority)

                if(tasks.isEmpty()){
                    call.respond(HttpStatusCode.NotFound)
                    return@get
                }

                call.respondText(
                    contentType = ContentType.parse("text/html"),
                    text = tasks.taskAsTable()
                )
            }

            catch(ex: IllegalArgumentException){
                call.respond(HttpStatusCode.BadRequest)
            }
        }
    }
}