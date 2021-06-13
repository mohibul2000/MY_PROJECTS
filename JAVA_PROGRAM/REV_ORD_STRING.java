import java.util.Scanner;

public class REV_ORD_STRING {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] str_array = str.split(" ");
        for(int i = str_array.length-1;i >= 0;i--){
            System.out.print(str_array[i]+" ");
        }
    }
}
