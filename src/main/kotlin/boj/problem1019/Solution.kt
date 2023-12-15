package boj.problem1019

import java.util.*

// https://www.acmicpc.net/problem/1019
fun main() = with(Scanner(System.`in`)) {
  solve(nextInt())
}

fun solve(n: Int) {
  val dp = Array(10) { 0 }
  var start = 1
  var end = n
  var digit = 1
  while (start <= end) {
    while (start % 10 != 0 && start <= end) {
      calc(start, digit, dp)
      start++
    }
    if (start > end) break
    while (end % 10 != 9 && start <= end) {
      calc(end, digit, dp)
      end--
    }
    val cnt = (end / 10 - start / 10 + 1)
    for (i in 0..9) {
      dp[i] += cnt * digit
    }
    start /= 10
    end /= 10
    digit *= 10
  }
  println(dp.joinToString(" "))
}

fun calc(x: Int, digit: Int, dp: Array<Int>) {
  var num = x
  while (num > 0) {
    dp[num % 10] += digit
    num /= 10
  }
}
