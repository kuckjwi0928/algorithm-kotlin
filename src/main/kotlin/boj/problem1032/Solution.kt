package boj.problem1032

import java.util.*

// https://www.acmicpc.net/problem/1032
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  val t = nextInt()
  val arr = Array(t) { next() }
  println(solve(arr))
}

private fun solve(arr: Array<String>): String {
  for (i in arr[0].indices) {
    val c = arr[0][i]
    for (j in 1 until arr.size) {
      if (c != arr[j][i]) {
        arr[0] = arr[0].replaceRange(i, i + 1, "?")
        break
      }
    }
  }
  return arr[0]
}
