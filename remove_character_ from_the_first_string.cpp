#include<stdio.h>
int main()
{
int i,j,k; char s[100],p[100];
printf("Enter 1st String: ");
 gets(s);
printf("Enter 2nd String: "); 
gets(p);
i=0;
while(p[i]!='\0')
{
j=0;
while(s[j]!='\0')
{
if(s[j]==p[i])
{
k=j;
while(s[k]!='\0')
{
s[k]=s[k+1];
k++;
}
break;
}
else
{
j++;
}
}
i++;
}
printf("Final String: %s\n",s);
return 0;
}
