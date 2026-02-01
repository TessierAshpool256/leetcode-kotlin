package org.tessier.ashpool.leetcode.solution

import kotlin.math.max
import kotlin.math.min


@Suppress("MagicNumber", "ClassNaming")
class Solution_011 {

    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0

        while (left < right) {
            maxArea = max(
                a = maxArea,
                b = min(
                    a = height[left],
                    b = height[right]
                ) * (right - left)
            )

            if (height[left] < height[right])
                left++
            else
                right--
        }

        return maxArea
    }
}
