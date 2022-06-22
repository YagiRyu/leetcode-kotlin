class SearchInsert {

    private fun search(nums: IntArray, target: Int, min: Int, max: Int): Int {
        if (nums.isEmpty()) return -1

        val mid: Int = (min + max) / 2

        if (min > max) {
            if (nums[0] > target) {
                return 0
            }
            return mid + 1
        }

        return if (nums[mid] == target) {
            mid
        } else if (nums[mid] < target) {
            search(nums, target, mid + 1, max)
        } else {
            search(nums, target, 0, mid - 1)
        }
    }

    fun searchInsert(nums: IntArray, target: Int): Int {
        val max = nums.size
        val min = 0
        return search(nums, target, min, max - 1)
    }
}

fun main() {
    val searchInsert = SearchInsert()
    val nums = intArrayOf(1, 3, 5, 6)
    println(searchInsert.searchInsert(nums, 5))
    println(searchInsert.searchInsert(nums, 2))
    println(searchInsert.searchInsert(nums, 7))
    println(searchInsert.searchInsert(nums, 0))
    println(searchInsert.searchInsert(intArrayOf(2, 5), 1))
}
