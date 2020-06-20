# Strings
"""
7. Write a Python program to get a string from a given string where all occurrences of
the last character have been changed to ‘*’, except the last character itself.
"""

st="GREATER"
length=len(st)
ch=st[length-1]
st=st.replace(ch,"*")
ch=st[length-1]
print(st)

