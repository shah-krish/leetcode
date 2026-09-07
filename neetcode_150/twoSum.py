from typing import List
def twoSum(self, nums: List[int], target: int) -> List[int]:
    values = dict()
    for i in range(nums):
        if target-nums[i] in values:
            return [values.get(target-nums[i]), i]
        else:
            values[nums[i]] = i
    return [0,0]