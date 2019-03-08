# https://www.hackerrank.com/challenges/ctci-balanced-brackets

matches = {'{': '}', '[': ']', '(': ')'}


def is_matched(expression):
    stack = []
    for b in expression:
        if b in ['{', '[', '(']:
            stack.append(b)
        else:
            if not stack:
                return False
            opening = stack.pop()
            if b != matches[opening]:
                return False
    return not stack


t = int(input().strip())
for a0 in range(t):
    expression = input().strip()
    if is_matched(expression):
        print("YES")
    else:
        print("NO")
