class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        var altX = x

        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var revertedNumber = 0
        while (altX > revertedNumber) {
            revertedNumber = revertedNumber * 10 + altX % 10
            altX /= 10
        }
        return altX == revertedNumber || altX == revertedNumber / 10
    }
}

fun main() {
    val palindromeNumber = PalindromeNumber()
    print(palindromeNumber.isPalindrome(12321))
}
