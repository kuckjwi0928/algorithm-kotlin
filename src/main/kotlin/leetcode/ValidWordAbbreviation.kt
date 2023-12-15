package leetcode

// https://leetcode.com/problems/valid-word-abbreviation/description/
class ValidWordAbbreviation {
    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        var i = 0
        var j = 0
        while (i < word.length && j < abbr.length) {
            if (word[i] == abbr[j]) {
                i++
                j++
            } else if (abbr[j] == '0') {
                return false
            } else if (abbr[j].isDigit()) {
                var k = j
                while (k < abbr.length && abbr[k].isDigit()) {
                    k++
                }
                i += abbr.substring(j, k).toInt()
                j = k
            } else {
                return false
            }
        }
        return i == word.length && j == abbr.length
    }
}

fun main() {
    val solution = ValidWordAbbreviation()
    println(solution.validWordAbbreviation("internationalization", "i12iz4n"))
    println(solution.validWordAbbreviation("apple", "a2e"))
}
