package cn.edu.xjtlu.cpt105.week4.kotlin

/**
 * Exercises for week 4
 */
object Exercises4 {

    /**
     * Exercise 4.1 Reverse Integers:
     *
     * @param nums the integer array to be reversed.
     */
    fun reverseInts(nums: IntArray) {
        (0 until nums.size / 2).forEach {
            val temp = nums[it]
            nums[it] = nums[nums.size - it - 1]
            nums[nums.size - it - 1] = temp
        }
    }

    /**
     * Exercise 4.2 Copy Even Indices
     *
     * @param nums the input integer array.
     * @return the new array with elements at even indicies.
     */
    fun copyEven(nums: IntArray): IntArray {
        val output = IntArray((nums.size + 1) / 2)
        var i = 0
        var j = 0
        while (i < nums.size) {
            output[j] = nums[i]
            i += 2
            j++
        }
        return output
    }

    /**
     * Exercise 4.3 A Diamond is FORever
     *
     * @param n the height of the diamond.
     */
    private fun diamond(n: Int) {
        var n = n
        if (n < 0) n*=-1
        if (n % 2 == 0) n++

        /**
         * Helper function to build half a diamond
         */
        val diamondRow = { i: Int ->
            ". ".repeat(n / 2 + 1 - i) + "* ".repeat(2 * i - 1) + ". ".repeat(n / 2 + 1 - i)
        }

        repeat(n / 2) {
            println(diamondRow(it + 1))
        }
        println("* ".repeat(n))
        repeat(n / 2) {
            println(diamondRow(n / 2 - it))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        diamond(9)
    }


    /**
     * Exercise 4.4 Arithmetic Series
     *
     * @param n the input in series.
     * @return the array of integer following all sequences of the arithmetic progression a_{n+1}=a_n+1
     */
    fun arithSeries(n: Int): IntArray? {
        if (n < 0) return null
        val outputSeries = IntArray(n * (n + 1) / 2)
        var i = 1
        var k = 0
        while (k < outputSeries.size) {
            var j = 1
            while (j <= i) outputSeries[k++] = j++
            i++
        }
        return outputSeries
    }

}