package cn.edu.xjtlu.cpt105.week4.kotlin

/**
 * Course Works for week 4
 */
object Courseworks4 {

    /**
     * CW1 4.1 Band Matrix
     *
     * @param n     the dimension of the array.
     * @param width the width of the band.
     */
    fun bandMatrix(n: Int, width: Int) {
        val band = Array(n) { CharArray(n) }
        // fill zeros initially
        (0 until n).forEach { i ->
            (0 until n).forEach { j ->
                band[i][j] = '0'
            }
        }

        // fill bands
        (0 until n).forEach { i ->
            (0..width).forEach { j ->
                if (i + j < n) band[i][i + j]  = '*'
                if (i - j >= 0) band[i][i - j] = '*'
            }
        }

        // print line by line
        band.forEach {
            it.forEach { item -> print("$item  ") }
            println()
        }
    }

    /**
     * CW1 4.2 Easy As 123
     *
     * @param nums input int array.
     * @return processed int array.
     */
    fun easyAs123(nums: IntArray): IntArray {

        // initialize arrays for indicies
        val indiciesOf2 = IntArray(nums.size / 3)
        val indiciesOf3 = IntArray(nums.size / 3)

        // record positions of 2 and 3 in order of occurrence
        var twoCount   = 0
        var threeCount = 0
        nums.indices.forEach {
            if (nums[it] == 2) indiciesOf2[twoCount++]   = it
            if (nums[it] == 3) indiciesOf3[threeCount++] = it
        }

        // swaps each 3 and the number after 2 according to the order of occurrence
        (0 until twoCount).forEach {
            if (nums[indiciesOf2[it] + 1] == 3) return@forEach  // continue if pattern was matched
            val temp = nums[indiciesOf2[it] + 1]
            nums[indiciesOf2[it] + 1] = nums[indiciesOf3[it]]
            nums[indiciesOf3[it]] = temp
        }
        return nums
    }
}