from typing import List


def threeSum(self, nums: list[int]) -> list[list[int]]:
    if len(nums) < 3:
        return []

    ans = []
    nums.sort()

    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        j = i + 1
        k = len(nums) - 1
        while j < k:
            current_sum = nums[i] + nums[j] + nums[k]
            if current_sum == 0:
                ans.append([nums[i], nums[j], nums[k]])
                j += 1
                while j < k and nums[j] == nums[j - 1]:
                    j += 1

            elif current_sum > 0:
                k -= 1
            else:
                j += 1

    return ans


