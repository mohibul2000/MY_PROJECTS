
//THIS CODE IS WRITTEN BY MOHIBUL AKTAR MOLLAH

#include<stdio.h>
#include<string.h>
void RevSen(char* start, char* begin ,char* end,int n)
{
char t, *e; int i;
    if(*end=='\0')
    {
    e=end-1;
    while (begin < e)
     { 
        	t = *begin; 
	        *begin++ = *e; 
	        *e-- = t; 	
	 }
    	for(i=n-1;i>=0;i--)
	    printf("%c",start[i]);
        return;
    }
    if(*end==' ')
    {
        e = end-1;
        while (begin < e) 
        { 
        	t = *begin; 
	        *begin++ = *e;
	         *e-- = t; 
    	}
        begin = end+1;
    }
    RevSen(start,begin,end+1,n);
}
  
int  main() 
{ 
    char s[50]; 
    printf("Enter the sentance.....");
    gets(s); 
    printf("The reverse sentence is...");
    RevSen(s,s,s,strlen(s)); 
    return 0; 
} 
