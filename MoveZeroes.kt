class MoveZeroes {

    fun swap(nums: IntArray, start: Int, last: Int) {
        val tmp = nums[start]
        nums[start] = nums[last]
        nums[last] = tmp
    }

    fun moveZeroes(nums: IntArray) {
        var countZeroes = 0
        val m = ArrayDeque<Int>()

        for (i in nums.indices) {
            countZeroes += if (nums[i] == 0) 1 else 0
        }

        for (i in nums.indices) {
            if (nums[i] != 0) {
                m.add(nums[i])
            }
        }

        while (countZeroes > 0) {
            m.addLast(0)
            countZeroes--
        }

        for (i in nums.indices) {
            nums[i] = m[i]
        }
    }

    fun moveZeroes2(nums: IntArray) {
        var lastNonZeroFoundAt = 0

        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i]
            }
        }
        var i = lastNonZeroFoundAt
        while (i < nums.size) {
            nums[i] = 0
            i++
        }
    }
}

fun main() {
    val moveZeroes = MoveZeroes()
    val nums = intArrayOf(0, 1, 0, 3, 12)
    val zeroNums = intArrayOf(0)
    moveZeroes.moveZeroes2(nums)
    nums.forEach {
        println(it)
    }
    println()
    moveZeroes.moveZeroes2(zeroNums)
    zeroNums.forEach {
        println(it)
    }
}
