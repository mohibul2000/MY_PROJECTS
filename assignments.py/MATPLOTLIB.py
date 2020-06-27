"""
1. Write a Python program to display the grid and draw line charts of the
closing value of Alphabet Inc. between October 3, 2016 to October 7,
2016. Customized the grid lines with linestyle -, width .5. and color
blue.
Sample data:
Date,Close
03-10-16,772.559998
04-10-16,776.429993
05-10-16,776.469971
06-10-16,776.859985
07-10-16,775.080017
"""
# import datetime as DT
# from matplotlib import pyplot as plt
# from matplotlib.dates import date2num
# data = [(DT.datetime.strptime('2016-10-03', "%Y-%m-%d"), 772.559998),
#         (DT.datetime.strptime('2016-10-04', "%Y-%m-%d"), 776.429993),
#         (DT.datetime.strptime('2016-10-05', "%Y-%m-%d"), 776.469971),
#         (DT.datetime.strptime('2016-10-06', "%Y-%m-%d"), 776.859985),
#         (DT.datetime.strptime('2016-10-07', "%Y-%m-%d"), 775.080017 )]
# x = [date2num(date) for (date, value) in data]
# y = [value for (date, value) in data]
# fig = plt.figure()
# graph = fig.add_subplot(111)
# graph.plot(x,y,'r-o')
# graph.set_xticks(x)
# graph.set_xticklabels([date.strftime("%Y-%m-%d") for (date, value) in data])
# plt.xlabel('Date')
# plt.ylabel('Closing Value')
# plt.title('Closing stock value of Alphabet Inc.')
# plt.grid(linestyle='-', linewidth='0.5', color='blue')
# plt.show()

"""
2. Write a Python programming to display a bar chart of the popularity of
programming Languages.
Sample data:
Programming languages: Java, Python, PHP, JavaScript,
C#, C++
Popularity: 22.2, 17.6, 8.8, 8, 7.7, 6.7
"""

# import matplotlib.pyplot as plt
# x = ['Java', 'Python', 'PHP', 'JavaScript', 'C#', 'C++']
# popularity = [22.2, 17.6, 8.8, 8, 7.7, 6.7]
# x_pos = [i for i, _ in enumerate(x)]
# plt.bar(x_pos, popularity, color=(0.4, 0.6, 0.8, 1.0), edgecolor='blue')
# plt.xlabel("Languages")
# plt.ylabel("Popularity")
# plt.title("PopularitY of Programming Language")
# plt.xticks(x_pos, x)
# plt.minorticks_on()
# plt.grid(which='major', linestyle='-', linewidth='0.5', color='red')
# plt.grid(which='minor', linestyle=':', linewidth='0.5', color='black')
# plt.show()

"""
3. Write a Python program to create bar plot of scores by group and
gender. Use multiple X values on the same chart for men and women.
Sample Data:
Means (men) = (22, 30, 35, 35, 26)
Means (women) = (25, 32, 30, 35, 29)
"""

# import numpy as np
# import matplotlib.pyplot as plt
# n_groups = 5
# men_means = (22, 30, 33, 30, 26)
# women_means = (25, 32, 30, 35, 29)
# fig, ax = plt.subplots()
# index = np.arange(n_groups)
# bar_width = 0.35
# opacity = 0.8
# rects1 = plt.bar(index, men_means, bar_width,alpha=opacity,color='blue',label='Men')
# rects2 = plt.bar(index + bar_width, women_means, bar_width,alpha=opacity,color='green',label='Women')
# plt.xlabel('Person')
# plt.ylabel('Scores')
# plt.title('Scores by person')
# plt.xticks(index + bar_width, ('G1', 'G2', 'G3', 'G4', 'G5'))
# plt.legend()
# plt.tight_layout()
# plt.show()

"""
4. Write a Python programming to create a pie chart of gold medal
achievements of five most successful countries in 2016 Summer
Olympics.
Sample data:
country,gold_medal
United States,46
Great Britain,27
China,26
Russia,19
Germany,17
"""

# import matplotlib.pyplot as plt
# import pandas as pd
# df =  pd.read_csv('medal.csv')
# country_data = df["country"]
# medal_data = df["gold_medal"]
# colors = ["#1f77b4", "#ff7f0e", "#2ca02c", "#d62728", "#8c564b"]
# explode = (0.1, 0, 0, 0, 0)
# plt.pie(medal_data, labels=country_data, explode=explode, colors=colors,
# autopct='%1.1f%%', shadow=True, startangle=140)
# plt.title("Gold medal achievements of five most successful\n"+"countries in 2016 Summer Olympics")
# plt.show()

"""
5. Write a Python program to draw a scatter plot comparing two subject
marks of Mathematics and Science. Use marks of 10 students.

Sample data:
Test Data:

math_marks = [88, 92, 80, 89, 100, 80, 60, 100, 80, 34]
science_marks = [35, 79, 79, 48, 100, 88, 32, 45, 20, 30]
marks_range = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
"""

# import matplotlib.pyplot as plt
# import pandas as pd
# math_marks = [88, 92, 80, 89, 100, 80, 60, 100, 80, 34]
# science_marks = [35, 79, 79, 48, 100, 88, 32, 45, 20, 30]
# marks_range = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
# plt.scatter(marks_range, math_marks, label='Math marks', color='blue')
# plt.scatter(marks_range, science_marks, label='Science marks', color='orange')
# plt.title('Scatter Plot')
# plt.xlabel('Marks Range')
# plt.ylabel('Marks Scored')
# plt.legend()
# plt.show()