package leetcode

class IntersectionofTwoArrays {
  fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val set1 = nums1.toSet()
    val set2 = nums2.toSet()
    return set1.filter { set2.contains(it) }.toIntArray()
  }
}

fun main() {
  val obj = IntersectionofTwoArrays()
  println(obj.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList())
  println(obj.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).toList())
}
