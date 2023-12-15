package boj.problem2738

import java.util.*

// https://www.acmicpc.net/problem/2738
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  val n = nextInt()
  val m = nextInt()
  val arr1 = Array(n) { IntArray(m) }
  val arr2 = Array(n) { IntArray(m) }
  for (i in 0 until n) {
    for (j in 0 until m) {
      arr1[i][j] = nextInt()
    }
  }
  for (i in 0 until n) {
    for (j in 0 until m) {
      arr2[i][j] = nextInt()
    }
  }
  solve(arr1, arr2)
}

private fun solve(arr1: Array<IntArray>, arr2: Array<IntArray>) {
  for (i in arr1.indices) {
    for (j in arr1[i].indices) {
      print("${arr1[i][j] + arr2[i][j]} ")
    }
    println()
  }
}
