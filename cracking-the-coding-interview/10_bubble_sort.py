def sort(a):
    swaps = 0
    for _ in range(len(a)):
        is_sorted = True
        for i in range(len(a) - 1):
            if a[i] > a[i + 1]:
                a[i], a[i + 1] = a[i + 1], a[i]
                swaps += 1
                is_sorted = False
        if is_sorted:
            break
    return swaps

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
swaps = sort(a)
print('Array is sorted in {} swaps.'.format(swaps))
print('First Element: {}'.format(a[0]))
print('Last Element: {}'.format(a[-1]))
