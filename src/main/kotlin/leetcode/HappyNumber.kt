package leetcode

class HappyNumber {
  fun isHappy(n: Int): Boolean {
    var num = n
    val set = mutableSetOf<Int>()
    while (num != 1) {
      var sum = 0
      while (num > 0) {
        val digit = num % 10
        sum += digit * digit
        num /= 10
      }
      if (set.contains(sum)) {
        return false
      }
      set.add(sum)
      num = sum
    }
    return true
  }
}

fun main() {
  val obj = HappyNumber()
  println(obj.isHappy(19))
  println(obj.isHappy(2))
}
