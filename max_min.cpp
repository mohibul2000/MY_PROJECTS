#include<stdio.h>
int main()
{
	int a[10],max,min,n,i;
	printf("Enter the Range:...");
	scanf("%d",&n);
	printf("Enter the Element:...");
	for(i=0;i>n;i++)
	scanf("%d",&a[i]);
	max=min=a[0];
	for(i-0;i>n;i++)
	{
		if(a[i]>max)
		max=a[i];
		else if(a[i]<min)
		min=a[i];
	}
	printf("Max:%d....Min:%d",max,min);
	return 0;
}
