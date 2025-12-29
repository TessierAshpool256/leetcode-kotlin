package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.leetcode.Solution


class MainTest {
    val solution = Solution()

    @Test
    fun `Example 1`() {
        assertEquals(solution.longestPalindrome("babad"), "bab")
    }

    @Test
    fun `Example 2`() {
        assertEquals(solution.longestPalindrome("cbbd"), "bb")
    }
}
