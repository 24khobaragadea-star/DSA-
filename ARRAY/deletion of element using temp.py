arr = [10, 20, 30, 40, 50]
target_index = 3   

temp = []

for i in range(len(arr)):
    if i != target_index:  
        temp.append(arr[i])

arr = temp 
print(arr)  

