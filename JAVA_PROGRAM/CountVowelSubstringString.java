import java.util.Scanner;

public class CountVowelSubstringString {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
          System.out.print("ENTER THE NUMBER OF STRING : ");
          int s = Integer.parseInt(sc.nextLine());
          int sum = 0;
          while (s != 0){
              System.out.print("ENTER A STRING : ");
              String str = sc.nextLine();
              for(int i = 0; i<str.length(); i++){
                  if(str.charAt(i)=='a' || str.charAt(i)=='A'|| str.charAt(i)=='e'
                          || str.charAt(i)=='E'|| str.charAt(i)=='i'|| str.charAt(i)=='I'
                          || str.charAt(i)=='o'|| str.charAt(i)=='O'|| str.charAt(i)=='U'
                          || str.charAt(i)=='U')
                      sum = sum+(str.length()-i)*(i+1);
              }
              s--;
          }
        System.out.println(sum);
    }
}
