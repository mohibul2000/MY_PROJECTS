
//THIS CODE IS WRITTEN BY MOHIBUL AKTAR MOLLAH

#include<stdio.h>

double Pow(double x, int y)
{
    if(y == 0)
    return 1;
    else if(y > 0)
    return x * Pow(x, y - 1);
    else
    return 1 / Pow(x, -1*y);
}

int main()
{
	int a,b;
	printf("Enter Number: ");
	scanf("%d",&a);
	printf("Enter power: ");
	scanf("%d",&b);
	printf("%d^%d = %f",a,b,Pow(a,b));
	return 0;
}
