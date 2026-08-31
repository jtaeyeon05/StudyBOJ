class Solution {
    fun romanToInt(s: String): Int {
        var result = 0
        var remain = s
        
        while (remain.startsWith("M")) {
            result += 1000
            remain = remain.substring(1)
        }
        if (remain.startsWith("CM")) {
            result += 900
            remain = remain.substring(2)
        }
        while (remain.startsWith("D")) {
            result += 500
            remain = remain.substring(1)
        }
        if (remain.startsWith("CD")) {
            result += 400
            remain = remain.substring(2)
        }
        while (remain.startsWith("C")) {
            result += 100
            remain = remain.substring(1)
        }
        if (remain.startsWith("XC")) {
            result += 90
            remain = remain.substring(2)
        }
        while (remain.startsWith("L")) {
            result += 50
            remain = remain.substring(1)
        }
        if (remain.startsWith("XL")) {
            result += 40
            remain = remain.substring(2)
        }
        while (remain.startsWith("X")) {
            result += 10
            remain = remain.substring(1)
        }
        if (remain.startsWith("IX")) {
            result += 9
            remain = remain.substring(2)
        }
        while (remain.startsWith("V")) {
            result += 5
            remain = remain.substring(1)
        }
        if (remain.startsWith("IV")) {
            result += 4
            remain = remain.substring(2)
        }
        while (remain.startsWith("I")) {
            result += 1
            remain = remain.substring(1)
        }

        return result
    }
}