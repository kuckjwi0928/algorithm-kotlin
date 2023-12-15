package leetcode

class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var max = 0
        for (i in 0 .. nums.lastIndex) {
            if (nums[i] == 1) {
                count++
            } else {
                count = 0
            }
            max = maxOf(max, count)
        }
        return max
    }
}

fun main() {
    val solution = MaxConsecutiveOnes()
    println(solution.findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
}