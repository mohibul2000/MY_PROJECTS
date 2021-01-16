import java.util.*;

public class Selection_Sort{
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        int n=sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<arr.length; i++)  {  
   
                   arr[i]=sc.nextInt();  
        }
       int min,temp;
       for(int i=0 ; i<arr.length ; i++){
              min = i;
           for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[min]){
                   min = j;
           }
         }
           temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
       System.out.println("THE SORTED ARRAY IS : ");
      for(int i=0; i<arr.length; i++){
         
         System.out.print(arr[i]+" ");
     }

}
}