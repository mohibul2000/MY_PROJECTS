import java.util.*;

class Example{
      int cal(int []a,int b){
           int temp;
        for(int i=0;i<b;i++){
            for(int j=i+1;j<b;j++){
              if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               }
            }
          
          }
        return a[1];
       }
}

public class Second_largest_item_Array{
      public static void main(String[] args){
             
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the size of the array : ");
             int n = sc.nextInt(); 
             int arr[] = new int[n];
             System.out.println("Enter the item of the array : ");  
             for(int i = 0;i<arr.length;i++){
                 arr[i] = sc.nextInt();
              }  
             Example ex = new Example();
             System.out.println("THE SECOND LARGEST ITEM IS : "+ex.cal(arr,arr.length));
       }
}