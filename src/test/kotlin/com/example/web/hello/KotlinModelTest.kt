package com.example.web.hello

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class KotlinModelTest {

    @Test
    fun test() {
        val kotlinModel = KotlinModel("kotlin model")
        assertEquals("kotlin model", kotlinModel.value)
    }

}
