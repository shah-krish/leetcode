def characterReplacement(self, s: str, k: int) -> int:
    freq = [0] * 26
    left = 0
    right = 0
    maxLength = 0
    maxFreq = 0
    while right < len(s):
        position = ord(s[right]) - ord('A')
        freq[position] += 1
        maxFreq = max(maxFreq, freq[position])

        while (right - left + 1) - maxFreq > k:
            p2 = ord(s[left]) - ord('A')
            freq[p2] -= 1
            left += 1
            maxFreq = max(freq)

        maxLength = max(maxLength, right-left+1)
        right+=1

    return maxLength