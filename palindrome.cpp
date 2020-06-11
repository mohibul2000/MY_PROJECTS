#include<stdio.h>
#include<math.h>
int main()
{
	int n,s=0,r=0,t;
	printf("enter the number:",n);
	scanf("%d",&n);
               for(t=n;n>0;n=n/10)
               {
               	
	
	
	r=n%10;
	s=(s*10)+r;
}
	if(s==t)
	printf("number is palindrome:%d",s);
		else
	printf("number is not palindrome:%d",s);	
	return 0;
	
}
