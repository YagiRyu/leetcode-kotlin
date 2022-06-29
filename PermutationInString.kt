class PermutationInString {

    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1CharArray = Array(26) { 0 }
        s1.forEach { s1CharArray[it - 'a'] += 1 }
        for (index in 0..s2.length - s1.length) {
            val s1LocalCharArray = s1CharArray.copyOf()
            s2.substring(index, index + s1.length).forEach { s1LocalCharArray[it - 'a'] -= 1 }
            if (s1LocalCharArray.all { it == 0 }) {
                return true
            }
        }
        return false
    }
}

fun main() {
    val permutationInString = PermutationInString()
    println(permutationInString.checkInclusion("ab", "eidbaooo"))
}
