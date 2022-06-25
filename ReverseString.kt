class ReverseString {

    private fun swap(s: CharArray, start: Int, last: Int) {
        val tmp = s[start]
        s[start] = s[last]
        s[last] = tmp
    }

    fun reversString(s: CharArray) {
        var i = 0
        var j = s.size - 1
        while (i < j) {
            swap(s, i, j)
            i++
            j--
        }
    }

    fun reversString2(s: CharArray) {
        var l = 0
        var r = s.lastIndex
        while (l < r) {
            val t = s[l]
            s[l++] = s[r]
            s[r--] = t
        }
    }
}

fun main() {
    val reversString = ReverseString()
    val s1 = charArrayOf('h', 'e', 'l', 'l', 'o')
    val s2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
    reversString.reversString2(s1)
    reversString.reversString2(s2)
    s1.forEach {
        print(it)
    }
    println()
    s2.forEach {
        print(it)
    }
}
