package org.tessier.ashpool.leetcode.solution


@Suppress("MagicNumber", "ClassNaming")
class Solution_008 {

    fun myAtoi(s: String): Int {
        var pos = 0
        val text = s.trimIndent()

        if (text.isEmpty()) return 0

        val isNegative = when (text[pos]) {
            '-' -> { pos++; true }
            '+' -> { pos++; false }
            else -> { false }
        }

        while (pos < text.length && text[pos] == '0') pos++

        var number = 0L
        while (pos < text.length && text[pos] >= '0' && text[pos] <= '9') {
            number = (number * 10) + (text[pos++] - '0')
            if (number > Int.MAX_VALUE)
                return if (isNegative) Int.MIN_VALUE else Int.MAX_VALUE
        }

        return (number * if (isNegative) -1 else 1).toInt()
    }
}
