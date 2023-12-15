package leetcode

class DetectCapital {
    fun detectCapitalUse(word: String): Boolean {
        if (word.lowercase() == word) {
            return true
        }
        if (word.uppercase() == word) {
            return true
        }
        for (i in word.indices) {
            if (i == 0 && word[i].isLowerCase()) {
                return false
            } else if (i > 0 && word[i].isUpperCase()) {
                return false
            }
        }
        return true
    }
}

fun main() {
    val obj = DetectCapital()
    println(obj.detectCapitalUse("USA"))
    println(obj.detectCapitalUse("FlaG"))
    println(obj.detectCapitalUse("leetcode"))
    println(obj.detectCapitalUse("Leetcode"))
    println(obj.detectCapitalUse("a"))
}
