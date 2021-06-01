import java.util.*;

class Shortest_iten_in_Array{
      public static void main(String[] args){
             int arr[] = new int[10];
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the length of the array : ");
             int n = sc.nextInt();
             System.out.print("Enter the items of the array : ");
             
             for(int i=0;i<n;i++){
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