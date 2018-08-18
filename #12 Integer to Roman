class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        e = False
        if num >= 1000:
            e = True
        ans = ""
        n = str(num)
        i = 1 if e else 0
        strli = ["D", "C", "M", "L", "X", "C", "V", "I", "X"]
        while len(n) != i:
            a, b, c = strli.pop(), strli.pop(), strli.pop()
            if int(n[-1]) >= 5:
                if int(n[-1]) == 9:
                    ans += a + b
                else:
                    ans += b * (int(n[-1]) - 5) + c
            else:
                if int(n[-1]) == 4:
                    ans += c + b
                else:
                    ans += b * int(n[-1])
            n = n[:-1]
        if e:
            ans += "M" * (num // 1000)
        return ans[::-1]
        
