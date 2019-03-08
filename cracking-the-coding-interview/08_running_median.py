# https://www.hackerrank.com/challenges/ctci-find-the-running-median

import bisect

n = int(input().strip())
a = []
for a_i in range(n):
    a_t = int(input().strip())
    mid = len(a) // 2
    bisect.insort(a, a_t)
    print('{:.1f}'.format((a[mid] + a[len(a) - mid - 1]) / 2))
