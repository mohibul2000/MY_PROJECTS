#include<stdio.h>
#define MAX 5
int push();
int stk[MAX];
int top=-1;
int main()
{
int x;
while(1)
{

printf("enter x");scanf("%d",&x);
switch(x){
case 1:push();break;
default:printf("THANK YOU");}
}
return 0;
}
int push(int item)
{
if(top==MAX-1)
printf("OVERFLOW\n");
else
{printf("\nenter the item: ");
scanf("%d",&item);
top=top+1;
stk[top]=item;
return 0;
	}	
}
