"""1. Replace all odd numbers in arr with -1 without changing arr
Input
arr = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
"""

# import numpy as np
# arr=np.array([0,1,2,3,4,5,6,7,8,9])
# arr[arr%2!=0] = -1
# print(arr)

"""
2. Print or show only 3 decimal places of the numpy array rand_arr.
Input
rand_arr = np.random.random((5,3))
"""

# import numpy as np
# rand_arr = np.random.random((5,3))
# print(np.around(rand_arr,3))

"""
3. Stack arrays a and b vertically
Input
a = np.arange(10).reshape(2,-1)
b = np.repeat(1, 10).reshape(2,-1)
Output
#> array([[0, 1, 2, 3, 4],
#> [5, 6, 7, 8, 9],
#> [1, 1, 1, 1, 1],
#> [1, 1, 1, 1, 1]])
"""

# import numpy as np
# a = np.arange(10).reshape(2,-1)
# b = np.repeat(1, 10).reshape(2,-1)
# print(np.concatenate([a,b],axis=0))



"""
4. Create the following pattern without hardcoding. Use only numpy
functions and the below input array a.
Input:a = np.array([1,2,3])`
Desired Output :#> array([1, 1, 1, 2, 2, 2, 3, 3, 3, 1, 2,
3, 1, 2, 3, 1, 2, 3])
"""

# import numpy as np
# a = np.array([1,2,3])
# print(np.r_[np.repeat(a, 3), np.tile(a, 3)])


"""
5. Create a 2D array of shape 5x3 to contain random decimal numbers
between 5 and 10.
"""
# import numpy as np
# arr = np.random.rand(5, 3) * 5 + 5
# print(arr)


"""6. Reverse the columns of a 2D array arr.
Input
arr = np.arange(9).reshape(3,3)
"""
# import numpy as np
# arr = np.arange(9).reshape(3,3)
# arr1=np.flipud(arr)
# print(arr1)

"""
7. Get the positions where elements of a and b match
Input
a = [1,2,3,2,3,4,3,4,5,6]
b = [7,2,10,2,7,4,9,4,9,8]
Output
[1, 3, 5, 7]
"""

# import numpy as np
# a = [1,2,3,2,3,4,3,4,5,6]
# b = [7,2,10,2,7,4,9,4,9,8]

# print( np.where(a==b))

"""
8. Swap rows 1 and 2 in the array arr:
Input arr =np.arange(9).reshape(3,3) arr
"""

# import numpy as np
# arr=np.arange(9).reshape(3,3)
# print(arr)
# print(arr[[1,0,2],])

"""
9. Import the iris dataset keeping the text intact. Extract the text column
species from the 1D iris imported .
Input
url = 'https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data'
iris_1d = np.genfromtxt(url, delimiter=',', dtype=None)
"""

# import numpy as np
# url = 'https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data'
# iris_1d = np.genfromtxt(url, delimiter=',', dtype=None)
# species = np.array([row[4] for row in iris_1d])
# print(species[:5])

"""
10. Find the mean, median, standard deviation of iris's sepallength (1st
column)
Input
url = 'https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data'
iris = np.genfromtxt(url, delimiter=',', dtype='object')
"""

import numpy as np
url = 'https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data'
iris = np.genfromtxt(url, delimiter=',', dtype='object')
sepallength = np.genfromtxt(url, delimiter=',', dtype='float', usecols=[0])
mea, medi, s_d = np.mean(sepallength), np.median(sepallength), np.std(sepallength)
print(mea, medi, s_d)
