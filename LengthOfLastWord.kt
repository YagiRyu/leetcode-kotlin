class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        val splitString = s.split(" ")
        var result = ""

        splitString.forEach {
            if (it != "") {
                result = it
            }
        }
        return result.length
    }
}

fun main() {
    val lengthOfLastWord = LengthOfLastWord()
    val s1 = "Hello World"
    val s2 = "   fly me   to   the moon  "
    val s3 = "luffy is still joyboy"
    println(lengthOfLastWord.lengthOfLastWord(s1))
    println(lengthOfLastWord.lengthOfLastWord(s2))
    println(lengthOfLastWord.lengthOfLastWord(s3))
}
