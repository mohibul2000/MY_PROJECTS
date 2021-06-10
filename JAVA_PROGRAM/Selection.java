import java.util.*;

public class Selection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS : ");
        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("THE SORTED ARRAY IS : ");

        for(int i = 0; i<arr.length-1 ; i++){
            int minIndex = i;
            for(int j = i; j<arr.length ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;


        }
        for(int e: arr)
            System.out.println(e+" ");
    }

}
