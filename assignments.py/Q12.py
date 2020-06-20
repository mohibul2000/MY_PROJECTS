# Dictionaries
"""
12. Write a Python program to use split and join methods in the string and trace a
birthday with a dictionary.
"""
dic={"Mohibul":"10/11/2000",
     "Subhrangshu":"1/1/2000",
     "Koulik":"1/1/1999",
     "Sarthak":"1/1/1998",
     "Asis":"1/1/1997",
     "Kundan":"1/1/1996"}
print(dic.keys())          #split methods
print(dic.values())        #split methods
print(dic)
dic["Sayan"]="1/3/2000"    #join methods
print(dic)
print(dic.get("Sayan"))    #trace a birthday
