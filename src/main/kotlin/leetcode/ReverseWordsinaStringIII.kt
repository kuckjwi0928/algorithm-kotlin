package leetcode

class ReverseWordsinaStringIII {
    fun reverseWords(s: String): String = s.split(" ").joinToString(" ") { it.reversed()
    }
}

fun main() {
    val obj = ReverseWordsinaStringIII()
    println(obj.reverseWords("Let's take LeetCode contest"))
    println(obj.reverseWords("God Ding"))
}
