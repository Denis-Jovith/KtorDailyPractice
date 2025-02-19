package com.example

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ApplicationTest {

    @Test
    fun testNewEndpoint() = testApplication {
        application {
            module()
        }

        val response = client.get("/test1")

        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("html", response.contentType()?.contentSubtype)
        assertEquals("<h1> Hello From Tanzania Ktor </h1>", response.bodyAsText())
    }
}
