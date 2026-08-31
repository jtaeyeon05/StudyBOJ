class Solution {
    fun intToRoman(num: Int): String {
        var result = ""
        var remain = num

        while (remain >= 1000) {
            result += "M"
            remain -= 1000
        }
        if (remain >= 900) {
            result += "CM"
            remain -= 900
        }
        while (remain >= 500) {
            result += "D"
            remain -= 500
        }
        if (remain >= 400) {
            result += "CD"
            remain -= 400
        }
        while (remain >= 100) {
            result += "C"
            remain -= 100
        }
        if (remain >= 90) {
            result += "XC"
            remain -= 90
        }
        while (remain >= 50) {
            result += "L"
            remain -= 50
        }
        if (remain >= 40) {
            result += "XL"
            remain -= 40
        }
        while (remain >= 10) {
            result += "X"
            remain -= 10
        }
        if (remain >= 9) {
            result += "IX"
            remain -= 9
        }
        while (remain >= 5) {
            result += "V"
            remain -= 5
        }
        if (remain >= 4) {
            result += "IV"
            remain -= 4
        }
        while (remain >= 1) {
            result += "I"
            remain -= 1
        }

        return result
    }
}