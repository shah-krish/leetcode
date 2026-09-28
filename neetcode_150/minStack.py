class MinStack:

    def __init__(self):
        self.stack = []

    def push(self, value: int) -> None:
        if not self.stack or self.stack[-1][1] > value:
            self.stack.append([value, value])
        else:
            self.stack.append([value, self.stack[-1][1]])

    def pop(self) -> None:
        self.stack.pop()

    def top(self) -> int:
        return self.stack[-1][0]

    def getMin(self) -> int:
        return self.stack[-1][1]