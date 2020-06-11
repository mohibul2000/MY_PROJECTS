
//THIS CODE IS WRITTEN BY MOHIBUL AKTAR MOLLAH

#include<stdio.h>

void revStr(char *k)
{
	if(*k!='\0')
	{
	revStr(k+1);
	printf("%c",*k);
	}
}

int main()
{
	char str[10];
	printf("Enter a String..... ");
	 gets(str);
	printf("Reverse of the String is........ ");
	 revStr(str);
	printf("\n");
	return 0;
}
