"""
3. Write a Python program to display the following numbers if the number 5678 is given
5678
678
78
8
"""

n=int(input("ENTER THE SIZE OF THE NUMBER:"))
m=int(input("ENTER THE NUMBER:"))
for i in range(0,n+1,1):
    for j in range(i+1,n+1,1):
        print(m,end=" ")
    print()