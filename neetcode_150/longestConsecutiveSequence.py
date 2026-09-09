from typing import List

def longestConsecutive(self, nums: List[int]) -> int:
    if (len(nums) == 0):
        return 0
    elements = set(nums)
    counter = 1
    longest = 1
    for i in elements:
        if (i-1) in elements:
            continue
        elif (i+1) not in elements:
            continue
        else:
            k = i
            while(k+1) in elements:
                counter+=1
                k+=1
            longest = max(longest,counter)
            counter = 1
    return longest
#Solution works but time consuming because of nested loops
# def longestConsecutive(self, nums: List[int]) -> int:
#     elements = set(nums)
#     counter = 1
#     longest = 1
#     done = set()
#     for i in elements:
#         if i not in done:
#             k = i
#             if (i-1) in elements or (i+1) in elements:
#                 while(k+1) in elements:
#                     counter+=1
#                     done.add(k)
#                     k+=1
#                 v = i
#                 while(v-1) in elements:
#                     counter+=1
#                     v-=1
#                     done.add(v)
#             longest = max(longest,counter)
#             counter=1
#     return longest

