package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class MainTest {
    val solution = Solution_006()

    @Test
    fun `Example 1`() {
        val s = "PAYPALISHIRING"
        val numRows = 3
        assertEquals(solution.convert(s, numRows), "PAHNAPLSIIGYIR")
    }

    @Test
    fun `Example 2`() {
        val s = "PAYPALISHIRING"
        val numRows = 4
        assertEquals(solution.convert(s, numRows), "PINALSIGYAHRPI")
    }

    @Test
    fun `Example 3`() {
        val s = "A"
        val numRows = 1
        assertEquals(solution.convert(s, numRows), "A")
    }
}
