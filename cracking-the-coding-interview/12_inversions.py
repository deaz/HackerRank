def sort(collection, left_index, right_index):
    if left_index >= right_index:
        return 0
    mid = (right_index + left_index) // 2
    left_count = sort(collection, left_index, mid)
    right_count = sort(collection, mid + 1, right_index)
    i, j = left_index, mid + 1
    count = left_count + right_count
    res = []
    while i <= mid and j <= right_index:
        if collection[i] <= collection[j]:
            res.append(collection[i])
            i += 1
        else:
            res.append(collection[j])
            j += 1
            # all other elements in left greater than this element
            count += mid + 1 - i
    res.extend(collection[i:mid + 1])
    res.extend(collection[j:right_index + 1])
    j = 0
    for i in range(left_index, right_index + 1):
        collection[i] = res[j]
        j += 1
    return count


def count_inversions(a):
    count = sort(a, 0, len(a) - 1)
    return count


t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    arr = list(map(int, input().strip().split(' ')))
    print(count_inversions(arr))
