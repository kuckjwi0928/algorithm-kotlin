package leetcode

import java.util.*

class KeyboardRow {
    fun findWords(words: Array<String>): Array<String> {
        val firstRow = "qwertyuiop".toSet()
        val secondRow = "asdfghjkl".toSet()
        val thirdRow = "zxcvbnm".toSet()
        val result = mutableListOf<String>()
        for (word in words) {
            var firstRowCount = 0
            var secondRowCount = 0
            var thirdRowCount = 0
            for (char in word.lowercase(Locale.getDefault())) {
                if (firstRow.contains(char)) {
                    firstRowCount++
                } else if (secondRow.contains(char)) {
                    secondRowCount++
                } else if (thirdRow.contains(char)) {
                    thirdRowCount++
                }
            }
            if (firstRowCount == word.length || secondRowCount == word.length || thirdRowCount == word.length) {
                result.add(word)
            }
        }
        return result.toTypedArray()
    }
}

fun main() {
    val obj = KeyboardRow()
    println(obj.findWords(arrayOf("Hello", "Alaska", "Dad", "Peace")).joinToString())
}
