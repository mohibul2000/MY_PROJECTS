import java.util.Scanner;

public class Remove_Duplicate_Elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    for(int k=j; k < n - 1; k++){
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
