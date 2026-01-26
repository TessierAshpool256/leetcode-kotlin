package org.tessier.ashpool.leetcode.solution


class Solution_006 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s

        var pos = 0
        val matrix = Array(numRows) { StringBuilder() }

        var subPos: Int
        while (pos != s.length) {
            subPos = 0
            while (subPos < numRows-1 && pos != s.length) matrix[subPos++].append(s[pos++])
            subPos = numRows-1
            while (subPos > 0 && pos != s.length) matrix[subPos--].append(s[pos++])
        }

        return matrix.joinToString(separator = "") { listOfChars -> listOfChars.toString() }
    }
}
