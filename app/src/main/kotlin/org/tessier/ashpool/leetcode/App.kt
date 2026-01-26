package org.tessier.ashpool.leetcode

import org.tessier.ashpool.leetcode.solution.Solution_006


@Suppress("MagicNumber")
fun main() {
    val s = "PAYPALISHIRING"
    val numRows = 3

    val solution = Solution_006()

    println(s)
    println("\n===\nSolution: \nPAHNAPLSIIGYIR")

    val result = solution.convert(s, numRows)

    println(result)
}
