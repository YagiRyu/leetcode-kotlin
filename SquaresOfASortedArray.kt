import kotlin.math.*

class SquaresOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        val squares = nums.map { it * it }
        val sortedSquares = squares.sorted()
        var result = intArrayOf()
        var i = 0
        while (i < sortedSquares.size) {
            result += sortedSquares[i]
            i++
        }
        return result
    }

    fun sortedSquares2(nums: IntArray): IntArray {
        var i = 0
        var j = nums.size - 1
        var res = intArrayOf()
        while (i < j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                res += nums[i] * nums[i]
                i++
            } else {
                res += nums[j] * nums[j]
                j--
            }
        }
        res += nums[j] * nums[j]
        return res.reversedArray()
    }

    fun sortedSquares3(nums: IntArray): IntArray {
        return nums.map { it.toDouble().pow(2).toInt() }.sorted().toIntArray()
    }
}

fun main() {
    val squaresOfASortedArray = SquaresOfASortedArray()
    val nums = intArrayOf(-4, -1, 0, 3, 10)
    val result = squaresOfASortedArray.sortedSquares3(nums)
    result.forEach {
        println(it)
    }
}
