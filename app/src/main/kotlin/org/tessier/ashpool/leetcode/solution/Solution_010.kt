package org.tessier.ashpool.leetcode.solution


@Suppress("MagicNumber", "ClassNaming")
class Solution_010 {

    fun isMatch(s: String, p: String): Boolean {
        val memo = Array(s.length + 1) {
            arrayOfNulls<Boolean>(p.length + 1)
        }

        fun dp(i: Int, j: Int): Boolean {
            memo[i][j]?.let { return it }

            val ans = when {
                j == p.length -> {
                    i == s.length
                }
                j + 1 < p.length && p[j + 1] == '*' -> {
                    dp(i, j + 2)
                    || (
                        i < s.length
                        && ( p[j] == '.' || p[j] == s[i] )
                        && dp(i + 1, j)
                    )
                }
                else -> {
                    i < s.length
                    && (p[j] == '.' || p[j] == s[i])
                    && dp(i + 1, j + 1)
                }
            }

            memo[i][j] = ans

            return ans
        }

        return dp(0, 0)
    }
}
