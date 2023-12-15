package leetcode

class ThirdMaximumNumber {
    fun thirdMax(nums: IntArray): Int {
        val set = nums.toSet().sortedDescending()
        return if (set.size >= 3) set[2] else set[0]
    }
}

fun main() {
    val obj = ThirdMaximumNumber()
    println(obj.thirdMax(intArrayOf(2, 2, 3, 1)))
    println(obj.thirdMax(intArrayOf(3, 2, 1)))
    println(obj.thirdMax(intArrayOf(1, 2)))
    println(obj.thirdMax(intArrayOf(5, 2, 2)))
}
