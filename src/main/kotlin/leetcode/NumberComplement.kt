package leetcode

class NumberComplement {
  fun findComplement(n: Int): Int {
    var num = n
    var mask = 1
    while (num > 0) {
      num = num shr 1
      mask = mask shl 1
    }
    return n xor (mask - 1)
  }
}

fun main() {
  val obj = NumberComplement()
  println(obj.findComplement(5))
  println(obj.findComplement(1))
}
