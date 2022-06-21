class RomanToInteger {

    // Runtime: 377ms, faster than 50.73%
    // Memory usage: 38.9MB less than 70.48%
    fun romanToInt(s: String): Int {
        var result = 0
        var i = 0
        val romanNumber = s.toCharArray()
        while (i < romanNumber.size) {
            when (romanNumber[i]) {
                'I' -> {
                    if (i + 1 < romanNumber.size && romanNumber[i + 1] == 'V') {
                        result += 4
                        i++
                    } else if (i + 1 < romanNumber.size && romanNumber[i + 1] == 'X') {
                        result += 9
                        i++
                    } else {
                        result += 1
                    }
                }
                'V' -> result += 5
                'X' -> {
                    if (i + 1 < romanNumber.size && romanNumber[i + 1] == 'L') {
                        result += 40
                        i++
                    } else if (i + 1 < romanNumber.size && romanNumber[i + 1] == 'C') {
                        result += 90
                        i++
                    } else {
                        result += 10
                    }
                }
                'L' -> result += 50
                'C' -> {
                    if (i + 1 < romanNumber.size && romanNumber[i + 1] == 'D') {
                        result += 400
                        i++
                    } else if (i + 1 < romanNumber.size && romanNumber[i + 1] == 'M') {
                        result += 900
                        i++
                    } else {
                        result += 100
                    }
                }
                'D' -> result += 500
                'M' -> result += 1000
            }
            i++
        }
        return result
    }

    fun romanToInt2(s: String): Int {
        val hashMap: HashMap<String, Int> = hashMapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )

        var result = hashMap[s[s.length - 1].toString()]!!
        for (i in s.length - 2 downTo 0) {
            hashMap[s[i].toString()]?.let { index1 ->
                hashMap[s[i + 1].toString()]?.let { index2 ->
                    if (index1 < index2) {
                        result -= index1
                    } else {
                        result += index1
                    }
                }
            }
        }
        return result
    }
}

fun main() {
    val romanToInt = RomanToInteger()
    println(romanToInt.romanToInt2("III"))
    println(romanToInt.romanToInt2("LVIII"))
    println(romanToInt.romanToInt2("MCMXCIV"))
}
