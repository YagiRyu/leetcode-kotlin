class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if (n == 0) return
        var i = m
        var j = 0

        while (i < m + n) {
            nums1[i] = nums2[j]
            i++
            j++
        }
        return nums1.sort()
    }
}

fun main() {
    val mergeSortedArray = MergeSortedArray()
    mergeSortedArray.merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
    println(mergeSortedArray.merge(intArrayOf(1), 1, intArrayOf(), 0))
    println(mergeSortedArray.merge(intArrayOf(0), 0, intArrayOf(1), 1))
}
