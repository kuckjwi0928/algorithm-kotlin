package leetcode

class AssignCookies {
  fun findContentChildren(g: IntArray, s: IntArray): Int {
    g.sort()
    s.sort()
    var i = 0
    var j = 0
    while (i < g.size && j < s.size) {
      if (g[i] <= s[j]) {
        i++
      }
      j++
    }
    return i
  }
}

fun main() {
  val solution = AssignCookies()
  println(solution.findContentChildren(intArrayOf(1, 2, 3), intArrayOf(1, 1)))
  println(solution.findContentChildren(intArrayOf(1, 2), intArrayOf(1, 2, 3)))
}
