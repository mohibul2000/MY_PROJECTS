import java.util.Scanner;

public class FindUniqueElement_Array {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        int count = 0;
        int flag = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0){
                arr1[count] = arr[i];
                count++;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
