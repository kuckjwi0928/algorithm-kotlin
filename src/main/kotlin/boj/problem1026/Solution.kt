package boj.problem1026

import java.util.*

// https://www.acmicpc.net/problem/1026
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  val n = nextInt()
  val a = IntArray(n)
  val b = IntArray(n)
  for (i in 0 until n) {
    a[i] = nextInt()
  }
  for (i in 0 until n) {
    b[i] = nextInt()
  }
  println(solve(a, b))
}

private fun solve(a: IntArray, b: IntArray): Int {
  a.sort()
  val list = b.toMutableList()
  var sum = 0
  for (value in a) {
    val max = list.max()
    sum += value * max
    list.remove(max)
  }
  return sum
}
