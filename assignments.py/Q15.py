# Functions
"""
15. Write a Python program to define a function to compute GCD and LCM of two
numbers hence to find out GCD and LCM of two numbers.
"""
import math
def LCM(x, y):
    if x>y and (x%y)==0:
        print("LCM is ",x)
    elif y>x and (y%x)==0:
        print("LCM is ",y)
    elif x>y and (x%y)!=0:
        print("LCM is ",x*y)
    else:
        print("LCM is ",y*x)
def GCD(a,b):
    print("GCD is ",math.gcd(a,b))
x=3
y=9
GCD(x,y)
LCM(x,y)