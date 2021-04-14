package cn.edu.xjtlu.cpt105.week3.kotlin

import kotlin.math.max

/**
 * Exercises for week 3
 */
object Exercises3 {
    /**
     * Exercise 3.1 Black Jack
     */
    fun blackJack() {
        val answer: Int
        val firstNumber = readLine()!!.toInt()
        val secondNumber = readLine()!!.toInt()
        val firstIsValid = firstNumber in 1..21
        val secondIsValid = secondNumber in 1..21
        answer =
            if (firstIsValid && !secondIsValid) firstNumber
            else if (secondIsValid && !firstIsValid) secondNumber
            else if (firstIsValid) max(firstNumber, secondNumber)
            else -1
        println(answer)
    }

    /**
     * Exercise 3.2 Pandemic Spread
     */
    fun pandemicSpread() {
        val init = readLine()!!.toInt()
        val numInfect = readLine()!!.toInt()
        val population = readLine()!!.toInt()
        var infected = init
        var days = 1
        while (population > infected) {
            infected += infected * numInfect
            days++
        }
        println(days)
    }
}