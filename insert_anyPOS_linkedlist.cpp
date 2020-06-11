//insertion at any location//



#include<stdio.h>
#include<malloc.h>
int main()
{
	struct node
	{
		int no;
		struct node *ptr;
	};
	int count=0,choice=1,location;
	struct node *temp,*start,*end,*temp2;
	end=0;
	while(choice==1)
	{
		temp=(struct node *)malloc(sizeof(struct node));
		printf("enter a data\n");
		scanf("%d",&temp->no);
		if(end==0)
		{
			end=start=temp;
		}
		else
		{
			end->ptr=temp;
			end=temp;
		}
		printf("enter 0 & 1\n");
		scanf("%d",&choice);
		
	}
	end->ptr=0;
	temp=start;
	while(temp!=0)
	{
		printf("%d=",temp->no);
		count++;
		temp=temp->ptr;
	}
	printf("\n");
	printf("number of nodes=%d",count);
	
	
	
	printf("enter the location\n");
	scanf("%d",&location);
	
	
		temp=(struct node *)malloc(sizeof(struct node));
		printf("enter a data\n");
		scanf("%d",&temp->no);
		temp2=start;
	
	while(location-1>0)
	{
		location--;
		temp2=temp->ptr;
	}
	temp->ptr=temp2->ptr;
	temp2->ptr=temp;
	
	temp=start;
	while(temp!=0)
	{
		printf("%d=>",temp->no);
		temp=temp->ptr;
		
		return 0;
	}
}
