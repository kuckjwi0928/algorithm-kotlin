package leetcode

import java.util.Stack

class BaseballGame {
  fun calPoints(operations: Array<String>): Int {
    val stack = Stack<String>()
    for (op in operations) {
      when (op) {
        "C" -> stack.pop()
        "D" -> stack.push((stack.peek().toInt() * 2).toString())
        "+" -> {
          val top1 = stack.pop().toInt()
          val top2 = stack.pop().toInt()
          val newTop = top1 + top2
          stack.push(top2.toString())
          stack.push(top1.toString())
          stack.push(newTop.toString())
        }

        else -> {
          stack.push(op)
        }
      }
    }
    return stack.sumOf { it.toInt() }
  }
}

fun main() {
  val obj = BaseballGame()
  println(obj.calPoints(arrayOf("5", "2", "C", "D", "+")))
  println(obj.calPoints(arrayOf("5", "-2", "4", "C", "D", "9", "+", "+")))
  println(obj.calPoints(arrayOf("1", "C")))
}
