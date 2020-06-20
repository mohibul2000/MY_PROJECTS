"""
2. Write a Python program to check whether a given character is present in a string or
not.
"""
str=input("ENTER THE STRING:")
str1=input("ENTER YOUR CHARACTER WHICH YOU FIND:")
a=(str.rfind(str1))
if a==-1:
    print("YOUR CHARACTER NOT PRASENT")
else:
    print("YOUR CHARACTER IS PRASENT")