class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        l = len(s)
        if l == 1:
            return False
        for i in range(1, l // 2 + 1):
            if l % i == 0:
                word, flag = s[0:i], True
                # print(f"word: {word}")
                for j in range(i, l, i):
                    # print(f"- {s[j:j+i]}")
                    if s[j:j+i] != word:
                        flag = False
                if flag:
                    return True
        return False
