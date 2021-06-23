import java.util.Scanner;

public class CountSubstringString {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        String str = sc.nextLine();
        int n = str.length();
        for(int i = 0; i<n; i++){
            System.out.println(str.charAt(i)+" "+(n-i)*(i+1));
        }

    }
}
