package leetcode

import java.util.*

class BackspaceStringCompare {
    fun backspaceCompare(s: String, t: String): Boolean {
        return removeBackspaceWord(s) == removeBackspaceWord(t)
    }

    private fun removeBackspaceWord(s: String): String {
        val stack = Stack<Char>()
        for (w in s) {
            if (w == '#') {
                if (stack.isNotEmpty()) {
                    stack.pop()
                }
            } else {
                stack.push(w)
            }
        }
        return stack.joinToString("")
    }
}

fun main() {
    val obj = BackspaceStringCompare()
    println(obj.backspaceCompare("ab#c", "ad#c"))
    println(obj.backspaceCompare("ab##", "c#d#"))
    println(obj.backspaceCompare("a#c", "b"))
    println(obj.backspaceCompare("a##c", "#a#c"))
}
