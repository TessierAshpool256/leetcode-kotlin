package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.solution.Solution_007


class Test_007 {
    val solution = Solution_007()

    @Test
    fun `Example 1`() {
        val x = 123
        assertEquals(solution.reverse(x), 321)
    }

    @Test
    fun `Example 2`() {
        val x = -123
        assertEquals(solution.reverse(x), -321)
    }

    @Test
    fun `Example 3`() {
        val x = 120
        assertEquals(solution.reverse(x), 21)
    }

    @Test
    fun `Example 4`() {
        val x = 1534236469
        assertEquals(solution.reverse(x), 0)
    }

    @Test
    fun `Example 5`() {
        val x = -2147483412
        assertEquals(solution.reverse(x), -2143847412)
    }

    @Test
    fun `Example 6`() {
        val x = 1563847412
        assertEquals(solution.reverse(x), 0)
    }
}
