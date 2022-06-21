class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        var i = 1
        while (i < strs.size) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) return ""
            }
            i++
        }
        return prefix
    }

    fun longestCommonPrefix2(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var i = 0
        var j = 1
        while (i < strs[0].length) {
            val c = strs[0][i]
            while (j < strs.size) {
                if (i == strs[j].length || strs[j][i] != c) {
                    return strs[0].substring(0, i)
                }
                j++
            }
            i++
        }
        return strs[0]
    }
}

fun main() {
    val longestCommonPrefix = LongestCommonPrefix()
    val strs = arrayOf("dog", "racecar", "car")
    val strs2 = arrayOf("flower","flow","flight")
    println(longestCommonPrefix.longestCommonPrefix2(strs))
    println(longestCommonPrefix.longestCommonPrefix2(strs2))
}
