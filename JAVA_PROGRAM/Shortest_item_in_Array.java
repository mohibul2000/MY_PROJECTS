import java.util.*;

class Shortest_item_in_Array{
      public static void main(String[] args){
             
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the length of the array : ");
             int n = sc.nextInt();
             int arr[] = new int[n];
             System.out.print("Enter the items of the array : ");
             
             for(int i=0;i<arr.length;i++){
                  arr[i] = sc.nextInt();
               } 
             int min = arr[0];
            
             for(int i=0; i<arr.length; i++){
                if(min > arr[i]){
                  min = arr[i];
                 }
             }
             System.out.print("Smallest Element of the array is = " + min); 
      }
}