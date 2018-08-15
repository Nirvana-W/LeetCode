class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == " ": return 1
        localMax = 0
        charli = []
        for i in range(0, len(s)):
            if s[i] not in charli:
                charli.append(s[i])
            else:
                localMax = len(charli) if localMax < len(charli) else localMax
                if s[i] == s[i - 1]:
                    charli = [s[i]] 
                else:
                    charli = charli[charli.index(s[i]) + 1:]
                    charli.append(s[i])
        return max(localMax, len(charli))
        
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == " ": return 1
        maxLen, i, start, pos = 0, -1, 0, {}
        for char in s:
            i += 1
            if char in pos:
                if i - start > maxLen:
                    maxLen = i - start
                start = i if pos[char] + 1 == i else start + 1
            pos[char] = i
        return max(maxLen, len(s) - start)
