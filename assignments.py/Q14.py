"""
14. Write a Python program to input player's name(string) and runs(int) scored for n
number of players where n should be an input from the keyboard, Store the players’
details in a dictionary called 'cricket'. After preparing the dictionary, input player's name
and print the runs scored by him otherwise returns'-1' if player name not found.
"""
n=int(input("HOW MANY PLAYERS YOU CAN CHOOSE:"))
list_name=[]
list_score=[]
for i in range(n):
    ele=input("ENTER THE PLAYER NAMES: ")
    list_name.append(ele)
print(list_name)
for i in range(n):
    ele2=int(input("ENTER THE SCORES: "))
    list_score.append(ele2)
print(list_score)
player_list=dict(zip(list_name,list_score))
print(player_list)
num=input("ENTER A PLAYER NAME: ")
if num in player_list:
    print(player_list[num])
else:
    print("-1")


# player=input("ENTER THE  PLAYER NAME:")
# if player in class_list:
#     print(class_list[player])
# else:
#     print("-1")
    # class_list[temp[0]] = int(temp[1])


# # Displaying the dictionary
# for key, value in class_list.items():
# 	print('Name: {}, Score: {}'.format(key, value))

# lis_name=["MOHIBUL","KOULIK","BIKI","SARTHAK","ASIS","KUNDAN"]
# lis_salary=[20,25,30,35,40,45]
# Emp_lis=dict(zip(lis_name,lis_salary))
# print(Emp_lis)