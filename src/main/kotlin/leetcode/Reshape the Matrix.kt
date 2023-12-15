package leetcode

class `Reshape the Matrix` {
  fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val m = mat.size
    val n = mat[0].size
    if (m * n != r * c) {
      return mat
    }
    val res = Array(r) { IntArray(c) }
    var i = 0
    var j = 0
    for (row in mat) {
      for (col in row) {
        res[i][j] = col
        j++
        if (j == c) {
          i++
          j = 0
        }
      }
    }
    return res
  }
}

fun main() {
  val obj = `Reshape the Matrix`()
  obj.matrixReshape(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 1, 4)
}
