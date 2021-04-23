import java.util.Scanner;

public class Permutation{
   public static void main(String[] args){
      int n,r,f1,f2,ans;
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER THE N: ");
      n = sc.nextInt();
      System.out.println("ENTER THE R: ");
      r = sc.nextInt();
      f1 = n;
      for(int i = n-1 ; i>=1 ; i--){
          f1 = f1*i;
      }
      f2 = n-r;
      for(int i = f2-1; i<=0 ; i--){
      f2 = f2*i;
      }
      ans = (f1/f2);
      System.out.println(ans+"ways");
      }
}