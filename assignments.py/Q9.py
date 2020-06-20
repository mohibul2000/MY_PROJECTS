
"""
9. Write a Python program to multiply two matrices.
"""

m1=[[1,2,3],
    [4,5,3],
    [3,4,5]]
m2=[[3,5,7],
    [7,9,8],
    [8,9,7]]
mul=[[0,0,0],
     [0,0,0],
     [0,0,0]]
for i in range(len(m1)):
    for j in range(len(m2[0])):
        for k in range(len(m2)):
            mul[i][j] += m1[i][k] * m2[k][j]

for result in mul:
    print(result)