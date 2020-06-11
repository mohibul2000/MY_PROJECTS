
//THIS PROGRAM IS WRITTEN BY MOHIBUL AKTAR MOLLAH


#include<stdio.h>
#define INF 999

int d[20];
int Q[20],f=-1,r=-1;

void insert(int x)
{
	if(f==-1 || f<r)
	{
	r=0; f=-1;
	}
	Q[++f]=x;
}

void remove(int x)
{
	int i,j;
	for(i=r;i<=f;i++)
	{
	if(Q[i]==x)
	break;
	}
	for(j=i;j<=f;j++)
	{
	Q[j]=Q[j+1];
	}
	f--;
}

int empty(void)
{
	if(f==-1 || f<r)
	return 1;
	return 0;	
}

int present(int x)
{
	int i;
	for(i=r;i<=f;i++)
	{
	if(Q[i]==x)
	return 1;
	}
	return 0;
}

int* Dijkstra_single(int s,int v,int G[][20])
{
	int i,j,k,min;
	d[s]=0;
	for(i=0;i<v;i++)
	{
	if(i!=s)
	d[i]=999;
	insert(i);
	}
	
	while(!empty())
	{
	min=INF;
	for(i=0;i<v;i++)
	{
	if(min>d[i] && present(i))
	{
	min=d[i];
	k=i;
	}
	}
		
	remove(k);
		
	for(i=0;i<v;i++)
	{
	if(G[k][i]!=0){
	if(d[k]+G[k][i] < d[i])
	{
	d[i] = d[k]+G[k][i];
	}
	}
	}
	}
	return d;
}

int main()
{
	int i,j,v,e,m,n,c,s,G[20][20];
	int *d;
	
	printf("Enter Total Number of  Edges: ");
	 scanf("%d",&e);
	 printf("Enter Total Number of Vertices: ");
	 scanf("%d",&v);
	
	for(i=0;i<v;i++)
	{
	for(j=0;j<v;j++)
	{
	G[i][j]=0;
	}
	}
	
	for(i=0;i<e;i++)
	{
	printf("%d: Starting and Ending Vertex and Cost: ",i+1);
	scanf("%d%d%d",&m,&n,&c); 
	G[m-1][n-1]=c;
	}
	
	printf("Enter Starting Vertex: "); 
	scanf("%d",&s);
	
	d = Dijkstra_single(s-1,v,G);
	
	for(i=0;i<v;i++)
	{
	if(i+1!=s && d[i]!=INF)
	printf("\nMinimum Cost From %d to %d is %d.\n",s,i+1,d[i]);
	}
	printf("\n");
}
