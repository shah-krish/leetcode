from typing import List

def maxArea(self, height: List[int]) -> int:
    left = 0
    right = len(height)-1
    capacity = 0
    while left < right:
        capacity = max(capacity,(right-left) * min(height[left], height[right]))
        if height[left] <= height[right]:
            left+=1
        else:
            right-=1
    return capacity

