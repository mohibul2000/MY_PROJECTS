#include <stdio.h>

void stringChng(char *str);

int main(){

  int count=0;

  char fn1[1000],fn2[1000];
  printf("ENTER THE 1ST STRING : ");
  scanf("%s",fn1);
  printf("ENTER THE 2ND STRING : ");
  scanf("%s",fn2);

  stringChng(fn1);

  stringChng(fn2);

  for(int i=0; fn1[i]!='\0'; i++){

      for(int j=0;fn2[j]!='\0'; j++) {

          if(fn2[i]!='0' && fn1[i]==fn2[j]){

              if(i==j)

                 count=count+2;

              else

                 count=count+1;

             fn2[j]='0';

          }

      }

  }

printf("THE PROXIMITY SCORE IS : %d",count);

   return 0;

}

void stringChng(char *str)

{

   int k=0;

   while(str[k]!='\0')

   {

       if(str[k]>='A' && str[k]<='Z'){

           str[k]=str[k]+32;

       }

       ++k;

   }

}
