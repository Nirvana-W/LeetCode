class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0
        sign = 1
        if x < 1:
            sign = -1
            x = x * -1
        ans = 0
        while(x > 0):
            ans = ans * 10 + x % 10
            x = x // 10
        ans = ans * sign
        if ans < (-2 ** 31) or ans > (2 ** 31 - 1):
            return 0
        else:
            return ans
