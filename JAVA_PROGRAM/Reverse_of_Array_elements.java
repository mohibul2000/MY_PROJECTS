import java.util.*;

class Reverse_of_Array_elements{
      public static void main(String[] args){
             
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the length of the array : ");
             int n = sc.nextInt();
             int arr[] = new int[n];
             int sum = 0;
             System.out.print("Enter the items of the array : ");
             
             for(int i=0;i<arr.length;i++){
                  arr[i] = sc.nextInt();
               } 
             for(int i = arr.length-1;i>=0;i--)
               System.out.print(arr[i]+" ");
                    
               
    }
}