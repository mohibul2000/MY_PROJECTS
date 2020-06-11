
//THIS CODE IS WRITTEN BY MOHIBUL AKTAR MOLLAH

#include<stdio.h>

int count=0;
void T_H(int d,char a,char b,char c)
{
	if(d!=1)
	{
	T_H(d-1,a,c,b);
	printf("Step-%d: Move Disk %d from %c to %c.\n",++count,d,a,c);
	T_H(d-1,b,a,c);
	}
	else
		printf("Step-%d: Move Disk %d from %c to %c.\n",++count,d,a,c);
}

int main()
{
	int d;
	printf("Enter Total Number of Disks: "); 
	scanf("%d",&d);
	T_H(d,'A','B','C');
	return 0;
}
