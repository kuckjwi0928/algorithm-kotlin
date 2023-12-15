package leetcode

class `Robot Return to Origin` {
  fun judgeCircle(moves: String): Boolean {
    val position = intArrayOf(0, 0)
    for (move in moves) {
      when (move) {
        'U' -> position[1]++
        'D' -> position[1]--
        'R' -> position[0]++
        'L' -> position[0]--
      }
    }
    return position[0] == 0 && position[1] == 0
  }
}

fun main() {
  val obj = `Robot Return to Origin`()
  println(obj.judgeCircle("UD"))
}
