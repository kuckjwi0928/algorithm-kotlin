package boj.problem2164

import java.util.*

// https://www.acmicpc.net/problem/2164
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  println(solve(nextInt()))
}

fun solve(n: Int): Int {
  val deque = ArrayDeque<Int>()
  for (i in 1..n) {
    deque.add(i)
  }
  while (deque.size > 1) {
    deque.pop()
    deque.addLast(deque.pop())
  }
  return deque.pop()
}
