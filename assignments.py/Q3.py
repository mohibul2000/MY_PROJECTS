"""
3. Write a Python program to display the following numbers if the number 5678 is given
5678
678
78
8
"""

n=int(input("ENTER THE  NUMBER:"))
temp=m=n
i=1
while m>0:
    m=int(m/10)
    i=i*10
while n>0:
    temp=int(temp%i)
    n=int(n/10)
    i=i/10
    print(temp)
