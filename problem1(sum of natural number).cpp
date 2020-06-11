
#include<stdio.h>

int Sum(int n)
{
	if(n==0)
	return n;
	else
	return n + Sum(n-1);
}


int main()
{
	int n;
	printf("Enter Number: "); 
	scanf("%d",&n);
	printf("The Sum of %d Numbers is %d.\n",n,Sum(n));
	return 0;
}





