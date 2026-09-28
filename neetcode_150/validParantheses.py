def isValid(self, s: str) -> bool:
    if (s[0] == ')' or s[0] == ']' or s[0] == '}'):
        return False
    stack = []
    for bracket in s:
        if bracket == '(' or bracket == '[' or bracket == '{':
            stack.append(bracket)
        elif bracket == ')':
            if (not stack or stack[-1] != '('):
                return False
            else:
                stack.pop()
        elif bracket == ']':
            if (not stack or stack[-1] != '['):
                return False
            else:
                stack.pop()
        else:
            if not stack or stack[-1] != '{':
                return False
            else:
                stack.pop()
    return len(stack) == 0