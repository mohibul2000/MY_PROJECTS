#include<stdio.h>
int main()
 {
int n,i,j,a[50];
printf("Enter Range to Generate Prime Number: ");
scanf("%d",&n);
for(i=0;i<n;i++)
{
a[i]=0;
}
for(i=2;i<n;i++){
for(j=i*i;j<n;j+=i)
{
a[j-1]=1;
 }
}
printf("Prime Numbers are: ");
for (i=2;i<n;i++)
{
if (a[i-1]==0)
{
 printf("%d ",i);
}	
}
printf("\n");
return 0;
}
