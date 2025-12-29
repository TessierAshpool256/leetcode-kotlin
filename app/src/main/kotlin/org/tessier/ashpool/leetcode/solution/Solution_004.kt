package org.tessier.ashpool.leetcode.solution


class Solution_004 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var i1 = 0
        var i2 = 0

        val mergedArray = IntArray(nums1.size + nums2.size) {
            when {
                i1 < nums1.size && i2 < nums2.size -> {
                    if (nums1[i1] < nums2[i2]) {
                        nums1[i1++]
                    } else {
                        nums2[i2++]
                    }
                }
                i1 < nums1.size -> {
                    nums1[i1++]
                }
                else -> {
                    nums2[i2++]
                }
            }
        }

        return if (mergedArray.size % 2 == 1) {
            mergedArray[mergedArray.size / 2].toDouble()
        } else {
            (mergedArray[mergedArray.size / 2 - 1] + mergedArray[mergedArray.size / 2]) / 2.0
        }
    }

}
