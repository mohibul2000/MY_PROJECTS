#include<iostream>
using namespace std;
int fibo(int);

int main()
{
int no;
cout<<"Enter the range";
cin>>no;
cout<<"\n";
fibo(no);	
}
int fibo(int no)
{
	int i,c,a=0,b=1;
	cout<<a;
	cout<<"\n";
	cout<<b;
	for(i=0;i<no-2;i++)
	{
	c=a+b;
	cout<<"\n";
	cout<<c;
	a=b;
	b=c;
}
}
