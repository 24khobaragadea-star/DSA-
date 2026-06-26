def sumOfMatrix(arr):
    total = 0
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            total =total+arr[i][j]
    return total

arr = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("Sum =", sumOfMatrix(arr))