package leetcode

class DistributeCandies {
    fun distributeCandies(candyType: IntArray): Int {
        val set = candyType.toSet()
        val halfSize = candyType.size / 2
        return if (set.size > halfSize) halfSize else set.size
    }
}

fun main() {
    val obj = DistributeCandies()
    println(obj.distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)))
}
