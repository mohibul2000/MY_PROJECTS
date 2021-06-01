import java.util.*;

class Sum_of_Array_elements{
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
             for(int i = 0;i<arr.length;i++){
                  sum = sum+arr[i];
               }
             System.out.println("Sum of the array elements is : "+sum);
       }
}