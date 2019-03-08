# https://www.hackerrank.com/challenges/ctci-ransom-note

from collections import Counter


def ransom_note(magazine, ransom):
    return len(list((Counter(ransom) - Counter(magazine)).elements())) == 0


m, n = map(int, input().strip().split(' '))
magazine = input().strip().split(' ')
ransom = input().strip().split(' ')
answer = ransom_note(magazine, ransom)
if answer:
    print("Yes")
else:
    print("No")
