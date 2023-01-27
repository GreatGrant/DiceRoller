package com.gralliams.diceroller

class Dice(private var numSides: Int) {

    fun roll(): Int{
        return (1..numSides).random()
    }
}