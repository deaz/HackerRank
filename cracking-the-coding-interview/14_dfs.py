def search(grid, row_index, column_index, visited):
    if grid[row_index][column_index] == 0:
        return
    if (row_index, column_index) in visited:
        return
    visited.add((row_index, column_index))
    for i in range(row_index - 1, row_index + 2):
        for j in range(column_index - 1, column_index + 2):
            if row_index + i < 0 or


def biggest_region(grid):
    for i, row in enumerate(grid):
        for j in range(len(row)):
            search(grid, i, j, set())


n = int(input().strip())
m = int(input().strip())
grid = []
for grid_i in range(n):
    grid_t = list(map(int, input().strip().split(' ')))
    grid.append(grid_t)
print(biggest_region(grid))
