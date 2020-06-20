"""
16. Write a Python program to define function unique to find all the unique elements of a
list and hence to find the unique elements of a given list.
"""

def uni(list1):
    list_set=set(list1)
    u_list=(list(list_set))
    for i in u_list:
        print(i)

list1=[10,20,30,40,40,30,20,10,20]
print("UNIQUE VALUES ARE ",uni(list1))

