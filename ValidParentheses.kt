class ValidParentheses {

    // Runtime 171ms faster than 83.84%
    // Memory Usage 33.9MB, less than 83.57%
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val lookup = hashMapOf(
            '{' to '}',
            '[' to ']',
            '(' to ')'
        )
        s.forEach { c ->
            if (c in lookup.keys) {
                stack.add(lookup[c]!!)
            }
            if (c in lookup.values) {
                if (stack.isEmpty()) {
                    return false
                }
                if (c != stack.removeLast()) {
                    return false
                }
            }
        }
        if (stack.isNotEmpty()) {
            return false
        }
        return true
    }
}

fun main() {
    val validParentheses = ValidParentheses()
    val parentheses = "{[]}"
    val parentheses2 = "()[]{}"
    val parentheses3 = "(]"
    val parentheses4 = "([{])"
    val parentheses5 = "("
    val parentheses6 = ")"
    println(validParentheses.isValid(parentheses))
    println(validParentheses.isValid(parentheses2))
    println(validParentheses.isValid(parentheses3))
    println(validParentheses.isValid(parentheses4))
    println(validParentheses.isValid(parentheses5))
    println(validParentheses.isValid(parentheses6))
}
