class ReverseWordsInAString {

    fun swap(s: String, start: Int, last: Int) {
    }

    fun reverseWords(s: String): String {
        val words = s.split(" ")
            .joinToString(" ") {
                it.reversed()
            }
        return words
    }
}

fun main() {
    val reverseWordsInAString = ReverseWordsInAString()
    val s = "Let's take LeetCode contest"
    val s2 = "God Ding"
    println(reverseWordsInAString.reverseWords(s))
    println(reverseWordsInAString.reverseWords(s2))
}
