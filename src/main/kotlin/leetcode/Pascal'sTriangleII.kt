package leetcode

class `Pascal'sTriangleII` {
    fun getRow(rowIndex: Int): List<Int> {
        val result = mutableListOf<Int>()
        for (i in 0..rowIndex) {
            result.add(1)
            for (j in i - 1 downTo 1) {
                result[j] = result[j] + result[j - 1]
            }
        }
        return result
    }
}

fun main() {
    val obj = `Pascal'sTriangleII`()
    println(obj.getRow(3))
//    println(obj.getRow(0))
}