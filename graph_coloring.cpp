#include<stdio.h>
int m,n;
int c=0;
int G[10][10];
int x[50];
int co=0;
void mColor(int);
void NextVal(int);

void NextVal(int k)
{
	  int j;
	  while(1)
	  {
		x[k]=(x[k]+1)%(m+1);
		if(x[k]==0)
		{
			return;
		}
		for(j=1;j<=n;j++)
		{
			if(G[k][j]!=0 && (x[k]==x[j]))
			break;
		}
		if(j==n+1)
		{
		return;
	  }
	}
	
}
void mColor(int k)
{
	int i;
	while(1)
	{
		NextVal(k);
		if(x[k]==0)
		{
		return;
		}
	  else if(k==n)
		{
		c=1;
		for(i=1;i<=n;i++)
		{
			printf("%d  ",x[i]);
		}
		co++;
		printf("\n");
		}
		else
		mColor(k+1);	
	}
}

int main()
{
	int i,j,e,u,v;
	int temp;
	printf("\n ENTER THE NUMBER OF NODES:");
	scanf("%d",&n);

	for(i=1;i<=n;i++)
	{

		for(j=1;j<=n;j++)
		{

			G[i][j]=0;

		}
	}

	printf("ENTER THE NUMBER OF EDGES");
	scanf("%d",&e);

	for(i=1;i<=e;i++)
	{
	printf("ENTER START VERTEX & END VERTEX OF AN EDGE");
	scanf("%d%d",&u,&v);
	G[u][v]=G[v][u]=1;
	}


	printf("\nPOSSIBLE SOLUTIONS ARE\n");

	for(m=1;m<=n;m++)
	{
		mColor(1);
		if(c==1)
			break;
	}

	

	printf("\n THE CHROMATIC NUMBER IS %d",m);
	printf("\n THE TOTAL NUMBER OF SOLUTION IS %d",co);
	return 0;
}
