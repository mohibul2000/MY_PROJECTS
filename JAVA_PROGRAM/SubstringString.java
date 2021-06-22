import java.util.Scanner;

public class SubstringString {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        String str = sc.nextLine();
        int n = str.length();
        n = (n*(n+1))/2;
        System.out.println(n);
    }
}
