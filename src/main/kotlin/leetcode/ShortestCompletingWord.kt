package leetcode

class ShortestCompletingWord {
  fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
    val map = licensePlate.filter { it.isLetter() }
      .groupingBy { it.lowercaseChar() }
      .eachCount()
    var result = ""
    for (word in words) {
      if (result.isNotEmpty() && result.length <= word.length) {
        continue
      }
      val wordMap = word.groupingBy { it }.eachCount()
      var isCompleting = true
      for ((k, v) in map) {
        if ((wordMap[k] ?: 0) < v) {
          isCompleting = false
          break
        }
      }
      if (isCompleting) {
        result = word
      }
    }
    return result
  }
}

fun main() {
  val obj = ShortestCompletingWord()
  println(obj.shortestCompletingWord("1s3 PSt", arrayOf("step", "steps", "stripe", "stepple")))
}
