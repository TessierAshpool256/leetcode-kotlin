package org.tessier.ashpool.leetcode.solution


@Suppress("MagicNumber", "ClassNaming")
class Solution_009 {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        val num = x.toString()
        val s = num.length
        var pos1 = 0
        var pos2 = s - 1

        if (s == 2) return num[0] == num[1]

        while (pos1 < pos2 && num[pos1] == num[pos2]) {
            pos1++
            pos2--
        }

        return pos1 == s / 2
    }
}
