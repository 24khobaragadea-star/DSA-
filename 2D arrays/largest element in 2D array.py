def maxOfMatrix(arr):
    maximum = arr[0][0]
    for i in range(5):
        for j in range(5):
            if arr[i][j] > maximum:
                maximum = arr[i][j]
    return maximum
arr = [
    [10, 2, 3, 4, 5],
    [6, 17, 8, 9, 10],
    [11, 12, 13, 14, 15],
    [16, 18, 19, 20, 21],
    [22, 23, 24, 25, 26]
]
print(maxOfMatrix(arr))