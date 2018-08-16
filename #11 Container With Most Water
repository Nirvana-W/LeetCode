class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        head = 0
        tail = len(height) - 1
        maxArea = 0
        while(head != tail):
            area = min(height[tail], height[head]) * (tail - head)
            maxArea = area if area > maxArea else maxArea
            if height[tail] > height[head]:
                head += 1
            else:
                tail -= 1
        return maxArea
            
            
        
