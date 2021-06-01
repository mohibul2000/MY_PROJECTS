import java.util.*;

class Table{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for(int i = 1; i <= n; i++){
              int tableOf = i;
              for(int j = 1; j <= 10; j++){
                 System.out.print(tableOf * j+" ");
               }
                System.out.println();
           }
   }
}