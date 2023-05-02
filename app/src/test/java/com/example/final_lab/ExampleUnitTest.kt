package com.example.final_lab


import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtendWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    val calcultion = Calcultion(12,13);
    @Test
    fun addition() {
        val addition = calcultion.addition()
        assertEquals(addition,25);
    }

    @Test
    fun substraction() {
        val substraction = calcultion.substraction()
        Assertions.assertNotNull(substraction)
    }

    @Test
    fun multiplication() {
        val multiplication = calcultion.multiplication()
        assertEquals(multiplication,156)
    }

    @Test
    fun division() {
        val division = calcultion.division()

    }
}