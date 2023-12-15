package leetcode

class RepeatedSubstringPattern {
    fun repeatedSubstringPattern(s: String): Boolean {
        return (s + s).substring(1, s.length * 2 - 1).contains(s)
    }
}

fun main() {
    val obj = RepeatedSubstringPattern()
    println(obj.repeatedSubstringPattern("abab"))
    println(obj.repeatedSubstringPattern("aba"))
    println(obj.repeatedSubstringPattern("abcabcabcabc"))
}
