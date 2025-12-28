package org.tessier.ashpool.leetcode.leetcode


@Suppress("MagicNumber")
fun main() {
    val nums1 = intArrayOf(1, 3, 8)
    val nums2 = intArrayOf(2, 4, 5, 6, 7)

    val solution =  Solution()

    val result = solution.findMedianSortedArrays(nums1, nums2)

    println(result)
}
