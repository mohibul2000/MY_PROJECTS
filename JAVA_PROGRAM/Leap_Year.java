import java.sql.SQLOutput;
import java.util.*;

public class Leap_Year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE YEAR : ");
        int n = sc.nextInt();
        if((n % 4 == 0 && n%100!=0)||n%400==0){
            System.out.println(n+" LEAP YEAR");
        }
        else{
            System.out.println(n+" NOT LEAP YEAR");
        }

    }
}
