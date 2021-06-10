import java.util.Scanner;

public class Segregate_0_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        System.out.println("ENTER 0 AND 1 : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i=0 ; i<count ; i++){
                System.out.println("0");
        }
        for(int i = count ; i < arr.length; i++){
            System.out.println("1");
        }
    }
}
