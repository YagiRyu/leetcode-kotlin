class RotateArray {
    fun rotate(nums: IntArray, k: Int) {
        val originalArray = nums.copyOf()
        for (i in nums.indices) {
            val j = (i + k) % nums.size
            nums[j] = originalArray[i]
        }
    }
}

fun main() {
    val rotateArray = RotateArray()
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println(rotateArray.rotate(nums, 1))
    println(rotateArray.rotate(nums, 2))
    println(rotateArray.rotate(nums, 3))
}
