from collections import Counter

def minWindow(self, s: str, t: str) -> str:
    if len(t) > len(s):
        return ""
    if s == t:
        return s
    freq = Counter(t)
    window = {}
    left, start = 0, -1
    have, need = 0, len(freq)
    length = float('inf')
    for right in range(len(s)):
        curr = s[right]
        window[curr] = window.get(window[curr],0)+1
        if curr in freq and window[curr] == freq[curr]:
            have+=1
        while have == need:
            temp_len = right-left+1
            if temp_len < length:
                start = left
                length = temp_len
            leftChar = s[left]
            window[leftChar] -= 1
            if leftChar in freq and window[leftChar] < freq[leftChar]:
                have-=1
            left+=1
    if start == -1:
        return ""
    return s[start:start+length]

