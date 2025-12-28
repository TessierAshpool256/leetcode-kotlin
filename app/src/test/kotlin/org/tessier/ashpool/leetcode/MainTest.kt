package org.tessier.ashpool.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.tessier.ashpool.leetcode.leetcode.Solution


class MainTest {
    val solution = Solution()

    @Test
    fun `Example 1`() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)

        assertEquals(solution.findMedianSortedArrays(nums1, nums2), 2.0)
    }

    @Test
    fun `Example 2`() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)

        assertEquals(solution.findMedianSortedArrays(nums1, nums2), 2.5)
    }
}
