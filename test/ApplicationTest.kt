package me.dvorkin

import kotlin.test.*
import io.ktor.http.*
import io.ktor.server.testing.*

class ApplicationTest {
    @Test
    fun foo() {
        assertEquals(1, 1)
    }

    @Test
    fun testRoot() {
        withTestApplication({ module() }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello World!", response.content)
            }
        }
    }
}
