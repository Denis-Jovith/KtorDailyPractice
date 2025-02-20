package com.example.com.example.model

enum class Priority {
    Low, Medium, High, Vital
}

data class Task(
    val name: String,
    val description:String,
    val priority:Priority
)

fun Task.taskAsRow() = """
    <tr>
        <td>$name</td>
        <td>$description</td>
        <td>$priority</td>
    </tr>
""".trimIndent()