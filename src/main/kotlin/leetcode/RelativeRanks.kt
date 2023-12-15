package leetcode

import java.util.PriorityQueue

class RelativeRanks {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val queue = PriorityQueue<Int>(compareBy { -it })
        for (i in score) {
            queue.add(i)
        }
        var counter = 1
        val map = mutableMapOf<Int, String>()
        while (!queue.isEmpty()) {
            map[queue.poll()] = when (counter) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> (counter).toString()
            }
            counter++
        }
        return score.map { map[it]!! }.toTypedArray()
    }
}

fun main() {
    val obj = RelativeRanks()
    println(obj.findRelativeRanks(intArrayOf(5, 4, 3, 2, 1)).joinToString())
    println(obj.findRelativeRanks(intArrayOf(10, 3, 8, 9, 4)).joinToString())
}
