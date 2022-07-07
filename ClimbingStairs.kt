class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        if (n <= 2) return n

        var result = 0
        var n1 = 2
        var n2 = 1

        (3..n).forEach {
            result = n1 + n2
            n2 = n1
            n1 = result
        }
        return result
    }
}

fun main() {
    val climbingStairs = ClimbingStairs()

    println(climbingStairs.climbStairs(4))
}
