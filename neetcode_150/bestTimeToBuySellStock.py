import sys
from typing import List


def maxProfit(self, prices: List[int]) -> int:
    if len(prices) <= 1:
        return 0
    buy = prices[0]
    sell = prices[1]
    result = sell - buy
    for i in range(1, len(prices) - 1):
        if buy > prices[i]:
            buy = prices[i]
            sell = 0
        if (sell < prices[i + 1]):
            sell = prices[i + 1]
        result = max(result, sell - buy)
    if result < 0:
        result = 0
    return result


