import java.util.*;

public class Greatest_3_digits_of_a_7_digit_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        int n = arr.length;
        int x = sc.nextInt();

        while(x != 0) {
            int i = 0;
            int last_number = x % 10;
            arr[i] = last_number;
            x = x / 10;
            i++;
            

            for ( i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }

            }


        }
        System.out.println(arr[n - 1] + "," + arr[n - 2] + "," + arr[n - 3]);

    }
}
