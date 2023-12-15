package leetcode

class MinCostClimbingStairs {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val dp = IntArray(cost.size + 1)
        for (i in 2..cost.size) {
            dp[i] = (dp[i - 1] + cost[i - 1]).coerceAtMost(dp[i - 2] + cost[i - 2])
        }
        return dp[cost.size]
    }
}

fun main() {
    val obj = MinCostClimbingStairs()
    println(obj.minCostClimbingStairs(intArrayOf(10, 15, 20)))
}
