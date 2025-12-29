package org.tessier.ashpool.leetcode.solution


class Solution_005 {
    private var maxLen = 0
    private var start = 0

    fun longestPalindrome(s: String): String {
        if (s.length < 2)
            return s

        for (i in s.indices) {
            expandAroundCenter(s, i, i)
            expandAroundCenter(s, i, i + 1)
        }

        return s.substring(start, start + maxLen)
    }

    private fun expandAroundCenter(s: String, left: Int, right: Int) {
        var l = left
        var r = right

        while (l >= 0 && r < s.length && s[l] == s[r]) {
            l--
            r++
        }

        val currentLen = r - l - 1

        if (currentLen > maxLen) {
            maxLen = currentLen
            start = l + 1
        }
    }
}
