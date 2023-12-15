package leetcode

// https://leetcode.com/problems/array-partition/description/
class ArrayPartition {
  fun arrayPairSum(nums: IntArray): Int {
    nums.sort()
    var sum = 0
    for (i in nums.indices step 2) {
      sum += nums[i]
    }
    return sum
  }
}

fun main() {
  val obj = ArrayPartition()
  println(obj.arrayPairSum(intArrayOf(1, 4, 3, 2)))
  println(obj.arrayPairSum(intArrayOf(6, 2, 6, 5, 1, 2)))
}
