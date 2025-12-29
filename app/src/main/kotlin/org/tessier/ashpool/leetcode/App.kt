package org.tessier.ashpool.leetcode

import org.tessier.ashpool.leetcode.solution.Solution_005


@Suppress("MagicNumber")
fun main() {
    val s = "babad"

    val solution = Solution_005()

    println(s)
    println("Solution: bab")

    val result = solution.longestPalindrome(s)

    println(result)
}
