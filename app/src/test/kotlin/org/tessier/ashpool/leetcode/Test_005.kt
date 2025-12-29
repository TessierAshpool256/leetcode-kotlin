package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.solution.Solution_005


class Test_005 {
    val solution = Solution_005()

    @Test
    fun `Example 1`() {
        assertEquals(solution.longestPalindrome("babad"), "bab")
    }

    @Test
    fun `Example 2`() {
        assertEquals(solution.longestPalindrome("cbbd"), "bb")
    }
}
