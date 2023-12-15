package leetcode

class BinarySearch {
  fun search(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size
    while (low < high) {
      val mid = (low + high) / 2
      when {
        nums[mid] < target -> low = mid + 1
        nums[mid] > target -> high = mid
        else -> return mid
      }
    }
    return -1
  }
}

fun main() {
  val obj = BinarySearch()
  println(obj.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
  println(obj.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
}
