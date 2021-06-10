import java.util.*;

public class Greatest_3_digits {
    public static void main(String[] args){
        int arr[] = {25,1,20,12,20,30,17};
        int x = arr.length;
        for(int i =0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }

        }
        System.out.println(arr[x-1]+","+arr[x-2]+","+arr[x-3]);


    }
}
