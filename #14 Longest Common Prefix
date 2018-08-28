class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if strs == []:
            return ""
        maxlen = len(strs[0])
        if maxlen == 0:
            return ""
        sameStr = strs[0]
        while maxlen > 0:
            allsame = True
            for str in strs:
                if len(str) < maxlen:
                    maxlen = len(str)
                    sameStr = str
                    allsame = False
                else:
                    if sameStr != str[0:maxlen]:
                        sameStr = sameStr[:-1]
                        maxlen -= 1
                        allsame = False
                        break
            if allsame:
                break
        if allsame == True:
            return sameStr
        else:
            return ""
