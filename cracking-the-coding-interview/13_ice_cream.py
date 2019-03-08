def search(a, m):
    for i in range(len(a) - 1):
        for j in range(i + 1, len(a)):
            if a[i] + a[j] == m:
                return '{} {}'.format(i + 1, j + 1)


t = int(input().strip())
for a0 in range(t):
    m = int(input().strip())
    n = int(input().strip())
    a = list(map(int, input().strip().split(' ')))
    print(search(a, m))
