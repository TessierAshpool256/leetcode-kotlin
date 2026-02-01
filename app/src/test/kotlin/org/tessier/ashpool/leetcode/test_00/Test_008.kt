package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.solution.Solution_008


class Test_008 {
    val solution = Solution_008()

    @Test
    fun `Example 1`() {
        val s = "42"
        assertEquals(solution.myAtoi(s), 42)
    }

    @Test
    fun `Example 2`() {
        val s = " -042"
        assertEquals(solution.myAtoi(s), -42)
    }

    @Test
    fun `Example 3`() {
        val s = "1337c0d3"
        assertEquals(solution.myAtoi(s), 1337)
    }

    @Test
    fun `Example 4`() {
        val s = "0-1"
        assertEquals(solution.myAtoi(s), 0)
    }

    @Test
    fun `Example 5`() {
        val s = "words and 987"
        assertEquals(solution.myAtoi(s), 0)
    }

    @Test
    fun `Example 6`() {
        val s = "-91283472332"
        assertEquals(solution.myAtoi(s), -2147483648)
    }

    @Test
    fun `Example 7`() {
        val s = ""
        assertEquals(solution.myAtoi(s), 0)
    }

    @Test
    fun `Example 8`() {
        val s = "-"
        assertEquals(solution.myAtoi(s), 0)
    }

    @Test
    fun `Example 9`() {
        val s = "2147483646"
        assertEquals(solution.myAtoi(s), 2147483646)
    }

    @Test
    fun `Example 10`() {
        val s = "2147483648"
        assertEquals(solution.myAtoi(s), 2147483647)
    }
}
