#include<stdio.h>
#define MAX 999
int G[10][10],Edge[10][10],d[10],u,v,e,V,w;
void Bellman_ford(int G[10][10],int V,int e,int Edge[10][10]);
int main()
{
		int i,j;
		printf("Enter the number of vertices : ");scanf("%d",&V);
		for(i=1;i<=V;i++)
		{	
			for(j=1;j<=V;j++)
			{
				G[i][j]=0;
			}
		}
		printf("Enter the number of edges : ");scanf("%d",&e);
		for(i=1;i<=e;i++)
		{
			printf("Enter the start vertex and the end vertex followed by the weight of the edge : ");scanf("%d%d%d",&u,&v,&w);
			G[u][v]=w;
			Edge[i][1]=u;
			Edge[i][2]=v;
		}
		Bellman_ford(G,V,e,Edge);
		return 0;
}

void Bellman_ford(int G[10][10],int V,int e,int Edge[10][10])
{
	int i,j,S,flag=1;
	for(i=1;i<=V;i++)
	{
		d[i]=MAX;
	}
	printf("Enter the source vertex : ");scanf("%d",&S);
	d[S]=0;
	for(i=1;i<=V-1;i++)
	{
		for(j=1;j<=e;j++)
		{
			u=Edge[j][1];
			v=Edge[j][2];
			if(d[u]+G[u][v]<d[v])
			{
				d[v]=d[u]+G[u][v];
			}
		}
	}
	for(i=1;i<=e;i++)
	{
		u=Edge[i][1];
		v=Edge[i][2];
		if(d[u]+G[u][v]<d[v])
		{
			flag=0;
		}
	}
	if(flag==0)
	{
		printf("\nThere exists a negative loop, thus the shortest path of the vertices cannot be found.");
	}
	else
	{
		printf("\nThe shortest paths of the other vertices from the source vertex A, are : ");
		for(i=1;i<=V;i++)
		{
			printf("\nVertex %d : %d",i,d[i]);
		}printf("\nNo Negative Cycle present in the graph");
	}
}

