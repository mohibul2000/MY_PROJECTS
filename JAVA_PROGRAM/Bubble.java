import java.util.*;

public class Bubble{
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
        boolean sorted = true;
        for(int i = 0; i<arr.length ; i++){
            for(int j = 0; j<arr.length-1-i ; j++){
                int temp = 0;
                if(arr[j+1] < arr[j]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    sorted = false;
                }
            }
            if(sorted) break;
        }
        for(int e: arr)
            System.out.println(e+" ");
    }

}