class AddBinary {
    fun addBinary(a: String, b: String): String {
        var i = a.length - 1
        var j = b.length - 1
        var result = ""
        var carry = 0
        var r = 0
        var curr = 0
        while (i >= 0 || j >= 0 || carry > 0) {
            curr = 0
            if (i >= 0) curr += a[i--] - '0'
            if (j >= 0) curr += b[j--] - '0'
            curr += carry
            r = curr % 2
            carry = curr / 2
            result += r
        }
        return result.reversed()
    }
}

fun main() {
    val addBinary = AddBinary()
}
