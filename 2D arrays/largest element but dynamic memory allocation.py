def maxOfMatrix(arr, rows, cols):
    maximum = arr[0][0]
    for i in range(rows):
        for j in range(cols):
            if arr[i][j] > maximum:
                maximum = arr[i][j]

    return maximum

rows = int(input("Enter number of rows: "))
cols = int(input("Enter number of columns: "))
# Dynamic 2D array
arr = []

print("Enter the elements:")

for i in range(rows):
    row = list(map(int, input().split()))
    arr.append(row)

print("Maximum element:", maxOfMatrix(arr, rows, cols))