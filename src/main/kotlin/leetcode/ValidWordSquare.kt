package leetcode

class ValidWordSquare {
  fun validWordSquare(words: List<String>): Boolean {
    for (i in words.indices) {
      for (j in words[i].indices) {
        if (j >= words.size || i >= words[j].length || words[i][j] != words[j][i]) {
          return false
        }
      }
    }
    return true
  }
}

fun main() {
  val obj = ValidWordSquare()
  println(obj.validWordSquare(listOf("abcd", "bnrt", "crmy", "dtye")))
  println(obj.validWordSquare(listOf("abcd", "bnrt", "crm", "dt")))
  println(obj.validWordSquare(listOf("ball", "area", "read", "lady")))
}