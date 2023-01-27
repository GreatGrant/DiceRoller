package com.gralliams.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generateNumber(){
        var dice = Dice(6)
        var diceRoll = dice.roll()
        assertTrue("The result of the dice rolled isn't in the range from 1 - 6 ", diceRoll in 1..6)
    }
}