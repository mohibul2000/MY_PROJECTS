#include<stdio.h>
int main()
{
	int n;
	printf("Enter the number:......");
	scanf("%d",&n);
	if(n%7==0 && n%10==0)
	printf("The number is both divisible by 7 & 10:%d",n);
	else
		printf("The number is not  divisible by 7 & 10:%d",n);
	return 0;
}
