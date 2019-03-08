# https://www.hackerrank.com/challenges/ctci-making-anagrams

from collections import Counter


def number_needed(a, b):
    c1 = Counter(a)
    c2 = Counter(b)
    res = (c1 - c2) + (c2 - c1)
    return len(list(res.elements()))


a = input().strip()
b = input().strip()

print(number_needed(a, b))
