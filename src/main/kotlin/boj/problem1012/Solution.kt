package boj.problem1012

import java.util.*

// https://www.acmicpc.net/problem/1012
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  val t = nextInt()
  for (i in 1..t) {
    val m = nextInt()
    val n = nextInt()
    val k = nextInt()
    val map = Array(m) { Array(n) { 0 } }
    for (j in 1..k) {
      val x = nextInt()
      val y = nextInt()
      map[x][y] = 1
    }
    println(solve(map))
  }
}

fun solve(arr: Array<Array<Int>>): Int {
  val m = arr.size
  val n = arr[0].size
  val visited = Array(m) { Array(n) { false } }
  var count = 0
  for (i in 0 until m) {
    for (j in 0 until n) {
      if (arr[i][j] == 1 && !visited[i][j]) {
        dfs(arr, visited, i, j)
        count++
      }
    }
  }
  return count
}

private fun dfs(arr: Array<Array<Int>>, visited: Array<Array<Boolean>>, x: Int, y: Int) {
  if (x < 0 || x >= arr.size || y < 0 || y >= arr[0].size) return
  if (arr[x][y] == 0 || visited[x][y]) return
  visited[x][y] = true
  dfs(arr, visited, x - 1, y)
  dfs(arr, visited, x + 1, y)
  dfs(arr, visited, x, y - 1)
  dfs(arr, visited, x, y + 1)
}
