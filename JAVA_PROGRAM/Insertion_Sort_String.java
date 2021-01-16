import java.util.*;

public class Insertion_Sort_String{
   public static void main(String[] args){
      Scanner obj = new Scanner(System.in);  
        System.out.print("Enter the number of strings you want to store: ");  
        int n = obj.nextInt();  
        String[] arr = new String[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0 ; i<arr.length ; i++)  {  
   
                   arr[i]=obj.next();  
        } 
         String temp="";
        for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                 if(arr[i].compareToIgnoreCase(arr[j])>0){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
               }
          } 
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
}
}
}