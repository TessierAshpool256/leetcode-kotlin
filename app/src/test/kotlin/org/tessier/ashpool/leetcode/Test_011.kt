package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.solution.Solution_010
import org.tessier.ashpool.leetcode.solution.Solution_011

class Test_011 {
    val solution = Solution_011()

    @Test
    fun `Example 1`() {
        val height = intArrayOf(1,8,6,2,5,4,8,3,7)
        Assertions.assertEquals(solution.maxArea(height), 49)
    }

    @Test
    fun `Example 2`() {
        val height = intArrayOf(1,1)
        Assertions.assertEquals(solution.maxArea(height), 1)
    }
}