package cn.edu.xjtlu.cpt105.week2.kotlin

import kotlin.math.*

/**
 * Course Works for week 2
 */
object Courseworks2 {
    /**
     * CW1 2.1 CMYK to RGB
     */
    fun cmykToRgb() {
        val cyan    = readLine()!!.toDouble()
        val magenta = readLine()!!.toDouble()
        val yellow  = readLine()!!.toDouble()
        val black   = readLine()!!.toDouble()
        val white = 1 - black
        val red  = (255 * white * (1 - cyan)).roundToInt()
        val green= (255 * white * (1 - magenta)).roundToInt()
        val blue = (255 * white * (1 - yellow)).roundToInt()
        println("red = $red\ngreen = $green\nblue = $blue")
    }

    /**
     * CW1 2.2 Great Circle Distance
     */
    fun greatCircleDistance() {
        // take input numbers
        val x1 = Math.toRadians(readLine()!!.toDouble())
        val y1 = Math.toRadians(readLine()!!.toDouble())
        val x2 = Math.toRadians(readLine()!!.toDouble())
        val y2 = Math.toRadians(readLine()!!.toDouble())
        // radius of Earth in km
        val r = 6371.0

        // apply equation
        val a = sin((x2 - x1) / 2.0).pow(2.0)
        val b = cos(x1) * cos(x2)
        val c = sin((y2 - y1) / 2.0).pow(2.0)
        val dist = 2.0 * r * asin(sqrt(a + b * c))
        println("$dist kilometres")
    }
}