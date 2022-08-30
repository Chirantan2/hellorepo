package com.example.diceroller


import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generateNum () {
        val dice = Dice(6)
        val rollResult = dice.roll()

        assertTrue("Result was out of range", rollResult in 1..6)
    }
}

//    @Test
//    fun addition_isCorrect() {
//        assertEquals(4, -2 + 6)
//
//    }
//    @Test
//    fun addition_incorrect() {
//        assertNotEquals(5, 2 + 2)
//    }