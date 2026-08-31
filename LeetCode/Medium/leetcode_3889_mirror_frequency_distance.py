class Solution:
    def mirrorFrequency(self, s: str) -> int:
        setA = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "0", "1", "2", "3", "4"]
        setB = ["z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "m", "9", "8", "7", "6", "5"]
        count = [0] * 18

        for c in s:
            if c in setA:
                count[setA.index(c)] += 1
            elif c in setB:
                count[setB.index(c)] -= 1

        return sum(map(lambda x: abs(x), count))

