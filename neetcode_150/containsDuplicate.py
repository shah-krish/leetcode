from typing import List

#This solution isn't as fast as the other one because the other one uses C compiler when we do set(nums). Since this one uses loops, we have to stick with python interpreter which is slower.
# class Solution:
#     def containsDuplicate(self, nums: List[int]) -> bool:
#         dupes = set()
#         for i in range(len(nums)):
#            if dupes.__contains__(nums[i]):
# Used contains originally as I'm switching from java but should never used dunder methods
#             if nums[i] in dupes:
#                 return True
#             dupes.add(nums[i])
#         return False

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s = set(nums)
        return len(s)!=len(nums)

