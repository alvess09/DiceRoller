package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*
import org.junit.Assert.assertTrue as assertTrue1

class ExampleUnitTest {
    @Test
    fun generatesNumber() {
        val dice =  Dice(6)
        val rollResult = dice.roll()
        assertTrue1("The value of rollResult was not between 1 and 6",rollResult in 1..6)

   }
}