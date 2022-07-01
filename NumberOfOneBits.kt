class NumberOfOneBits {
    fun hammingWeight(n: Int): Int {
        var sum = 0
        var number = n
        while (number != 0) {
            sum++
            number = number and (number - 1)
        }
        return sum
    }
}

fun main() {
    val num = "00000000000000000000000000001011"
    val numberOfOneBits = NumberOfOneBits()
    println(numberOfOneBits.hammingWeight(num.toInt()))
}
