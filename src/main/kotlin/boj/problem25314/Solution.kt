package boj.problem25314

import java.util.Scanner

// https://www.acmicpc.net/problem/25314
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  val n = nextInt()
  var result = "int"
  for (i in 0 until n/4) {
    result = "long $result"
  }
  println(result)
}
