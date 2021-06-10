import java.util.*;

public class Kth_value_Array {
    public static void main(String[] args){
        int arr[] = {25,1,20,12,20,30,17};
        for(int i =0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arr[n-1]);

    }
}
