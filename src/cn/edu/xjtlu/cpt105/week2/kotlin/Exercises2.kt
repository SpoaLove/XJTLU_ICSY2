package cn.edu.xjtlu.cpt105.week2.kotlin

import kotlin.math.atan2
import kotlin.math.hypot

/**
 * Exercises for week 2
 */
object Exercises2 {
    /**
     * Exercise 2.1 What day is it?
     */
    fun dateToDay() {
        val y = readLine()!!.toInt()
        val m = readLine()!!.toInt()
        val d = readLine()!!.toInt()

        val a = y - (14 - m) / 12
        val b = a + a / 4 - a / 100 + a / 400
        val c = m + 12 * ((14 - m) / 12) - 2

        val day = (d + b + 31 * c / 12) % 7
        println("It's day $day !")
    }

    /**
     * Exercise 2.2 Polar Coordinates
     */
    fun polarCoordinates() {
        val x = readLine()!!.toDouble()
        val y = readLine()!!.toDouble()
        val r = hypot(x, y)
        val theta = atan2(y, x)
        println("r = $r\ntheta = $theta")
    }
}