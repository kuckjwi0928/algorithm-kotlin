package leetcode

class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1
                count++
            }
        }
        return n <= count
    }
}

fun main() {
    val obj = CanPlaceFlowers()
    println(obj.canPlaceFlowers(intArrayOf(1, 0, 1, 0, 1, 0, 1), 1))
    println(obj.canPlaceFlowers(intArrayOf(0, 0, 1, 0, 1), 1))
}