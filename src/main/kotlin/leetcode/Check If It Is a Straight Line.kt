package leetcode

class `Check If It Is a Straight Line` {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        var prev = coordinates[0]
        for (i in 1 until coordinates.size) {
            val curr = coordinates[i]
            if ((curr[1] - prev[1]) * (curr[0] - coordinates[0][0]) != (curr[1] - coordinates[0][1]) * (curr[0] - prev[0])) {
                return false
            }
            prev = coordinates[i]
        }
        return true
    }
}

fun main() {
    val obj = `Check If It Is a Straight Line`()
    println(
        obj.checkStraightLine(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(5, 6),
                intArrayOf(6, 7)
            )
        )
    )
    println(
        obj.checkStraightLine(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(2, 2),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(5, 6),
                intArrayOf(7, 7)
            )
        )
    )
}
