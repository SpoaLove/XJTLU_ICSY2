package cn.edu.xjtlu.cpt105.week3.kotlin

/**
 * Course Works for week 3
 */
object Courseworks3 {
    /**
     * CW1 3.1 Right Triangle
     */
    fun rightTriangle() {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        val c = readLine()!!.toInt()
        val isPositive      = a > 0 && b > 0 && c > 0
        val isRightTriangle = a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a
        println(isPositive && isRightTriangle)
    }

    /**
     * CW1 3.2 Hailstone Sequence
     */
    fun hailStone() {
        var n = readLine()!!.toInt()
        var index = 1
        while (n != 1) {
            n = if (n % 2 == 0) n / 2 else 3 * n + 1
            index++
        }
        println(index)
    }
}