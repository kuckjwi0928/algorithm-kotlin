package leetcode

class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var leftSum = 0
        for (i in nums.indices) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i
            }
            leftSum += nums[i]
        }
        return -1
    }
}

fun main() {
    val obj = FindPivotIndex()
    println(obj.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))
}
