from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
         arr = [0] * 26
         for i in range(len(s)):
             arr[ord(s[i])-ord('a')] = arr[ord(s[i])-ord('a')]+1
         for i in range(len(t)):
             arr[ord(t[i]) - ord('a')] = arr[ord(t[i]) - ord('a')] - 1
         for i in arr:
             if i!=0:
                 return False
         return True

#Code below is faster because it uses C compiler however it uses O(N) space instead of O(1) as counter creates a hashmap
# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         return Counter(s) == Counter(t)