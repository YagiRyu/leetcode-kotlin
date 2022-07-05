class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            digits[i] += 1
            if (digits[i] <= 9) return digits
            digits[i] = 0
        }
        val result = IntArray(digits.size + 1)
        result[0] = 1

        return result
    }
}

fun main() {
    val plusOne = PlusOne()
    val digits1 = intArrayOf(1, 2, 3)
    val digits2 = intArrayOf(4, 3, 2, 9)
    val digits3 = intArrayOf(9)
    val digits4 = intArrayOf(9, 9, 9)

    plusOne.plusOne(digits1)
    plusOne.plusOne(digits2)
    plusOne.plusOne(digits3)
    plusOne.plusOne(digits4)

//    digits1.forEach {
//        print(it)
//    }
//    println()
//    digits2.forEach {
//        print(it)
//    }
    println()
    digits3.forEach {
        print(it)
    }
    println()
    digits4.forEach {
        print(it)
    }
    println()

}
