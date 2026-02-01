package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.solution.Solution_010

class Test_010 {
    val solution = Solution_010()

    @Test
    fun `Example 1`() {
        val s = "aa"
        val p = "a"
        Assertions.assertEquals(solution.isMatch(s, p), false)
    }

    @Test
    fun `Example 2`() {
        val s = "aa"
        val p = "a*"
        Assertions.assertEquals(solution.isMatch(s, p), true)
    }

    @Test
    fun `Example 3`() {
        val s = "ab"
        val p = ".*"
        Assertions.assertEquals(solution.isMatch(s, p), true)
    }
}