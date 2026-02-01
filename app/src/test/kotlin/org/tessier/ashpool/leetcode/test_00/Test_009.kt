package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.solution.Solution_009


class Test_009 {
    val solution = Solution_009()

    @Test
    fun `Example 1`() {
        val x = 121
        assertEquals(solution.isPalindrome(x), true)
    }

    @Test
    fun `Example 2`() {
        val x = -121
        assertEquals(solution.isPalindrome(x), false)
    }

    @Test
    fun `Example 3`() {
        val x = 10
        assertEquals(solution.isPalindrome(x), false)
    }

    @Test
    fun `Example 4`() {
        val x = 11
        assertEquals(solution.isPalindrome(x), true)
    }

    @Test
    fun `Example 5`() {
        val x = 100
        assertEquals(solution.isPalindrome(x), false)
    }
}
