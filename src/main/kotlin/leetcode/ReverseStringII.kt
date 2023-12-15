package leetcode

class ReverseStringII {
    fun reverseStr(s: String, k: Int): String {
        val sb = StringBuilder()
        var i = 0
        while (i < s.length) {
            sb.append(s.substring(i, if (i + k < s.length) i + k else s.length).reversed())
            i += k
            if (i < s.length) {
                sb.append(s.substring(i, if (i + k < s.length) i + k else s.length))
            }
            i += k
        }
        return sb.toString()
    }
}

fun main() {
    val obj = ReverseStringII()
    println(obj.reverseStr("abcdefg", 2))
    println(obj.reverseStr("a", 2))
}
