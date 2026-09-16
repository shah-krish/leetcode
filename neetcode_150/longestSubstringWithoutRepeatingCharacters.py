from typing import List

def lengthOfLongestSubstring(self, s: str) -> int:
    hs = set()
    left = 0
    for right in range(len(s)):
        while s[right] in hs:
            hs.remove(s[left])
            left+=1
        hs.add(s[right])
        longest = max(longest, right-left+1)
    return longest

# My solution works but the one above is more "pythonic" way to do the same
# def lengthOfLongestSubstring(self, s: str) -> int:
#     if(len(s)<=1):
#         return len(s)
#     hs = set()
#     longest = 1
#     hs.add(s[0])
#     left = 0
#     right = 1
#     while(right<len(s)):
#         if s[right] in hs:
#             longest = max(longest, len(hs))
#             while s[right] in hs:
#                 hs.remove(s[left])
#                 left+=1
#         else:
#             hs.add(s[right])
#             right+=1
#     longest = max(longest, len(hs))
#     return longest










