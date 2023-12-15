package boj.problem1100

import java.util.*

// https://www.acmicpc.net/problem/1100
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  val n = 8
  val m = 8
  val arr = Array(n) { CharArray(m) }
  for (i in 0 until n) {
    val line = next()
    for (j in 0 until m) {
      arr[i][j] = line[j]
    }
  }
  println(solve(arr))
}

fun solve(arr: Array<CharArray>): Int {
  var count = 0
  for (i in arr.indices) {
    for (j in arr[i].indices) {
      if (i % 2 == 0 && j % 2 == 0 && arr[i][j] == 'F') {
        count++
      } else if (i % 2 != 0 && j % 2 != 0 && arr[i][j] == 'F') {
        count++
      }
    }
  }
  return count
}
