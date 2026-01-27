package org.tessier.ashpool.leetcode.solution

import kotlin.math.abs


@Suppress("MagicNumber")
class Solution_007 {

    fun reverse(x: Int): Int {
        val border = Int.MAX_VALUE / 10
        var resoult = 0
        var input = x

        while (input != 0) {
            if (abs(resoult) > border)
                return 0

            resoult = resoult * 10 + input % 10
            input /= 10
        }

        return resoult
    }
}
