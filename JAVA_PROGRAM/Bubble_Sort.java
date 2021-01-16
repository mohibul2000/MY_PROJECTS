import java.util.*;

public class Bubble_Sort{
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        int n=sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  {  
   
                   arr[i]=sc.nextInt();  
        }  
        int temp;
        for(int i=0;i<arr.length;i++){
             int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                   if(arr[j]>arr[j+1])
                      {
                         temp=arr[j];
                          arr[j]=arr[j+1];
                          arr[j+1]=temp;
                          flag = 1;
                         }

             }
              if(flag == 0)
                {
                  break;

                 }
        }
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+"  ");
        }
}
}