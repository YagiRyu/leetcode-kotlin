class TwoSum2 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var j = 1

        numbers.forEachIndexed { index, i ->
            val result = target - numbers[index]
            while (j < numbers.size) {
                if (result == numbers[j]) {
                    return intArrayOf(index + 1, j + 1)
                }
                j++
            }
            j = index + 2
        }
        return intArrayOf()
    }

    fun twoSum2(numbers: IntArray, target: Int): IntArray {
        var l = 0
        var r = numbers.size - 1
        while (l < r) {
            val sum = numbers[l] + numbers[r]
            if (sum > target) r--
            else if (sum < target) l++
            else return intArrayOf(l + 1, r + 1)
        }
        return intArrayOf(-1, -1)
    }
}

fun main() {
    val twoSum = TwoSum2()
    val numbers = intArrayOf(2, 7, 11, 15)
    val numbers2 = intArrayOf(2, 3, 4)
    val numbers3 = intArrayOf(1, 2, 3, 4, 4, 9, 56, 90)

//    twoSum.twoSum(numbers, 9).forEach {
//        print(it)
//    }
//    twoSum.twoSum(numbers2, 6).forEach {
//        print(it)
//    }
    twoSum.twoSum2(numbers3, 8).forEach {
        println(it)
    }
}
