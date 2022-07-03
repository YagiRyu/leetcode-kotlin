class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0

        var i = 0
        for (j in nums.indices) {
            if (nums[j] != `val`) {
                nums[i] = nums[j]
                i++
            }
        }
        return i
    }
}

fun main() {
    val removeElement = RemoveElement()
    val nums1 = intArrayOf(3,2,2,3)
    val nums2 = intArrayOf(0,1,2,2,3,0,4,2)

    println(removeElement.removeElement(nums1, 3))
    nums1.forEach {
        print(it)
    }
    println()
    println("---------------------")
    println(removeElement.removeElement(nums2, 2))
    nums2.forEach {
        print(it)
    }
}
