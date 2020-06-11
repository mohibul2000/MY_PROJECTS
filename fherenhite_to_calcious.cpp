#include<stdio.h>
#include<math.h>
int main()
{
	int c,f;
	printf("enter the celcius temp:...");
	scanf("%d",&c);
	f=(9*c+160)/5;
	printf("changing temparature is:%d",f);
		printf("enter the fher temp:...");
	scanf("%d",&f);
	c=(5*f-160)/9;
	printf("changing temparature is:%d",c);
	return 0;
}
