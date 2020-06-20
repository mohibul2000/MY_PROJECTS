"""
13. Write a Python program to create a dictionary by combining two lists name for
employee name and salary for employee salary. Use the list name as the key and
salary as the value of dictionary elements.
"""

lis_name=["MOHIBUL","KOULIK","BIKI","SARTHAK","ASIS","KUNDAN"]
lis_salary=[20,25,30,35,40,45]
Emp_lis=dict(zip(lis_name,lis_salary))
print(Emp_lis)
