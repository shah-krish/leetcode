def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
    days = [0] * len(temperatures)
    stack = []
    for i, temperature in enumerate(temperatures):
        if not stack or temperature < stack[-1][0] :
            stack.append([temperature, i])
        else:
            while stack and temperature > stack[-1][0]:
                days[stack[-1][1]] = i - stack[-1][1]
                stack.pop()
            stack.append([temperature, i])
    return days

