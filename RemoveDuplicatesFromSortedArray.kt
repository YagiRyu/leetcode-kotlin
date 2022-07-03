class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var lastIndex = 1
        var curVal = nums[0]

        nums.forEachIndexed { index, _ ->
            if (nums[index] > curVal) {
                curVal = nums[index]
                nums[lastIndex] = nums[index]
                lastIndex++
            }
        }
        return lastIndex
    }
}

fun main() {
    val removeDuplicatesFromSortedArray = RemoveDuplicatesFromSortedArray()
    val nums1 = intArrayOf(1, 1, 2)
    val nums2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    println(removeDuplicatesFromSortedArray.removeDuplicates(nums1))
    nums1.forEach {
        print(it)
    }
    println("---------------------------------------")
    println(removeDuplicatesFromSortedArray.removeDuplicates(nums2))
    nums2.forEach {
        print(it)
    }
}
