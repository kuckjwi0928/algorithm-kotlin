package boj.problem1010

import java.util.*

// https://www.acmicpc.net/problem/1010
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  val t = nextInt()
  for (i in 1..t) {
    val m = nextInt()
    val n = nextInt()
    println(solve(m, n))
  }
}

private fun solve(m: Int, n: Int): Int {
  val dp = Array(m + 1) { Array(n + 1) { 0 } }
  for (i in 1..n) {
    dp[1][i] = i
  }
  for (i in 2..m) {
    for (j in i..n) {
      for (k in j downTo i) {
        dp[i][j] += dp[i - 1][k - 1]
      }
    }
  }
  return dp[m][n]
}
