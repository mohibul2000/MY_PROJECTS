import java.util.*;

class Sum_of_Fraction{
         public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the number : ");
              int n = sc.nextInt();
              float result=0;
              for(float i = 1; i <= n; i++){
                   
                   result+=1/i;
                   
               }
                 System.out.println(result);
}
}