package leetcode

class HeightChecker {
    fun heightChecker(heights: IntArray): Int {
        val expected = heights.copyOf()
        expected.sort()
        var diffCount = 0
        for (i in heights.indices) {
            if (heights[i] != expected[i]) {
                diffCount++
            }
        }
        return diffCount
    }
}

fun main() {
    val obj = HeightChecker()
    println(obj.heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
    println(obj.heightChecker(intArrayOf(5, 1, 2, 3, 4)))
}
