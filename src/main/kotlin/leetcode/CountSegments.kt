package leetcode

class CountSegments {
    fun countSegments(s: String): Int {
        if (s.isBlank()) {
            return 0
        }
        return s.trim()
            .replace("\\s+".toRegex(), " ")
            .split(" ")
            .count()
    }
}

fun main() {
    val solution = CountSegments()
    println(solution.countSegments("Hello, my name is John"))
    println(solution.countSegments(", , , ,        a, eaefa"))
}