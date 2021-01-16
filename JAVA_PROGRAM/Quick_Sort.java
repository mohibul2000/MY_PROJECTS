import java.util.*;

public class Quick_Sort{
          public static void main(String[] args){
          Scanner obj = new Scanner(System.in);
          Quick_Sort obj2 = new Quick_Sort();
          System.out.print("ENTER THE SIZE OF ARRAY : ");
          int n = obj.nextInt();
          System.out.print("ENTER THE ARRAY ELEMENTS : ");
          int[] arr = new int[n];
          int len = arr.length;
          for(int i=0; i<len; i++){
                      arr[i]=obj.nextInt();
              }
            obj2.sort(arr,0,len-1);
            obj2.printArray(arr);
          }

          int partition(int arr[], int low, int high) { 
                int pivot = arr[high];  
                 int i = (low-1); 
                 for (int j=low; j<high; j++){ 
            
                           if (arr[j] <= pivot){ 
                                i++; 
  
                                 int temp = arr[i]; 
                                 arr[i] = arr[j]; 
                                   arr[j] = temp; 
                            } 
                    } 
  
        
                      int temp = arr[i+1]; 
                      arr[i+1] = arr[high]; 
                      arr[high] = temp; 
  
           return i+1; 
          } 
  
  
         void sort(int arr[], int low, int high){ 
                          if (low < high){ 
                             int pi = partition(arr, low, high); 
  
            
                                            sort(arr, low, pi-1); 
                                            sort(arr, pi+1, high); 
                           } 
           } 
            
          static void printArray(int arr[]){ 
                  int n = arr.length; 
                      for (int i=0; i<n; ++i) 
                          System.out.print(arr[i]+" "); 
                          System.out.println(); 
           } 

}