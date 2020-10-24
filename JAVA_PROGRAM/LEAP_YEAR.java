import java.util.*;

class LEAP_YEAR{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YEAR: ");
int year = obj.nextInt();
if((year%4==0 && year%100!=0)||(year % 400==0)){
System.out.println(year+" IS LEAP YEAR......!");
}
else{
System.out.println(year+" IS NOT A LEAP YEAR......!");
}
}
} 