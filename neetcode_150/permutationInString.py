from collections import Counter
def checkInclusion(self, s1: str, s2: str) -> bool:
    if (len(s1) > len(s2)):
        return False
    freq = Counter(s1)
    left = 0
    for right in range(len(s2)):
        if (right - left > len(s1) - 1):
            if s2[left] in freq:
                freq[s2[left]] += 1
            left += 1
        if s2[right] in freq:
            freq[s2[right]] -= 1
        if all([freq[i] == 0 for i in freq]):
            return True
    return False