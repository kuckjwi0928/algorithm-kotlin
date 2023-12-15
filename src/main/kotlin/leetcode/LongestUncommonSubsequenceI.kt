package leetcode

class LongestUncommonSubsequenceI {
  fun findLUSlength(a: String, b: String): Int {
    if (a == b) {
      return -1
    }
    return a.length.coerceAtLeast(b.length)
  }
}

fun main() {
  val obj = LongestUncommonSubsequenceI()
  println(obj.findLUSlength("aba", "cdc"))
  println(obj.findLUSlength("aaa", "bbb"))
  println(obj.findLUSlength("aaa", "aaa"))
  println(obj.findLUSlength("aefawfawfawfaw", "aefawfeawfwafwaef"))
}
