class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = ""

        outerloop@ for (i in 0 .. Int.MAX_VALUE) {
            if (i >= strs[0].length) break

            val p = strs[0][i]
            for (j in 0 ..< strs.size) {
                if (strs[j].length <= i || strs[j][i] != p) break@outerloop
            }
            prefix += p
        }

        return prefix
    }
}