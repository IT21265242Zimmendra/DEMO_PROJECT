package com.example.final_lab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class CalcultionTest {

    val calcultion = Calcultion(12,13);
    @Test
    fun addition() {
        val addition = calcultion.addition()
        assertEquals(addition,25);
    }

    @Test
    fun substraction() {
        val substraction = calcultion.substraction()
        assertNotNull(substraction)
    }

    @Test
    fun multiplication() {
        val multiplication = calcultion.multiplication()
        assertEquals(multiplication,156)
    }

    @Test
    fun division() {
        val division = calcultion.division()
        assertNotNull(division)
    }
}