#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
}*start,*temp,*ptr,*last;
int ins_beg()
{
	temp=(struct node *)malloc(sizeof(struct node));
	temp->next=NULL;
	printf("ENTER THE ELEMENT");
	scanf("%d",&temp->data);
	if(start==NULL)
	start=NULL;
	else
	{
		temp->next=start;
		start=temp;
	}
}
int ins_end()
{
temp=(struct node *)malloc(sizeof(struct node));
	
	printf("ENTER THE ELEMENT");
	scanf("%d",&temp->data);
	if(last==NULL)
	{
		last=start=temp;
	}
	else
	{
		last->next=temp;
		last=temp;
	}
	last->next=NULL;
	
}
int ins_any()
{
	int pos,i;
	ptr=start;
	temp=(struct node *)malloc(sizeof(struct node));
	temp->next=NULL;
	printf("ENTER THE ELEMENT & POSITION");
	scanf("%d",&temp->data,&pos);
	for(i=1;i<pos-1;i++)
	ptr=ptr->next;
	temp->next=ptr->next;
	ptr->next=temp;
}
int del_beg()
{
	ptr=start;
	if(start==NULL)
	printf("LIST EMPTY");
	else
	{
		start=ptr->next;
		printf("DELETED:%d",ptr->next);
		free(ptr);
	}
}
int del_end()
{
		ptr=start;
	if(start==NULL)
	printf("LIST EMPTY");
	else
	{
		while(ptr->next!=NULL)
		{
			temp=ptr;
			ptr=ptr->next;
		}
		printf("DELETED :%d",ptr->next);
		free(ptr);
		temp->next=NULL;
	}
	
}
int del_any()
{
	int pos,i;
	ptr=start;
	temp=start;
	if(start==NULL)
	printf("LIST EMPTY");
	else
	{
		printf("enter position:");
		scanf("%d",&pos);
		for(i=1;i<pos;i++)
		{
			temp=ptr;
			ptr=ptr->next;
		}
		printf("DELETED:%d",ptr->next);
		temp->next=ptr->next;
		free(ptr);
	}
}
int display()
{
	ptr=start;
	if(start==NULL)
	printf("LIST EMPTY");
	else
	{
		while(ptr->next!=NULL)
		{
			printf("%d",ptr->next);
			ptr=ptr->next;
		}
		printf("%d",ptr->data);
	}
}
int main()
{
	int ch;
	do
	{
		printf("\n 1.INSERT_BEG 2.INSERT_END 3.INSERT_ANY 4.DELETE_BEG 5.DELETE_END 7.DELETE_ANY 6.DISPLAY:\n");
		printf("enter ypur choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:ins_beg();break;
				case 2:ins_end();break;
					case 3:ins_any();break;
			case 4:del_beg();break;	
			case 5:del_end();break;
			case 6:del_any();break;	
		case 7:display();break;
		default:printf("wrong choice");
		}
		
		
	}
	while(ch>0 && ch<8);
	return 0;
}










