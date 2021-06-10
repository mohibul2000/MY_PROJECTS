import java.util.Scanner;

public class Frequency_element_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        int v = -1;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                {
                    count += 1;
                    arr1[j] = v;
                }
            }
            if(arr1[i] != v){
               arr1[i] = count;
            }
        }
        for(int i = 0; i<arr.length;i++) {
            if (arr1[i] != v) {
                System.out.println(arr[i] + "," + arr1[i]);
            }
        }
    }
}
