//insertion at end//



#include<stdio.h>
#include<malloc.h>
int main()
{
	struct node
	{
		int no;
		struct node *ptr;
	};
	int count=0,choice=1;
	struct node *temp,*start,*end;
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
	return 0;
}
