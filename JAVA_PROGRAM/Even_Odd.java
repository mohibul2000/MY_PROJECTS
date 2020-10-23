import java.util.*;

class Even_Odd{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER: ");
int num = obj.nextInt();
if(num%2==0){
System.out.println(num+" IS EVEN....!");
}
else{
System.out.println(num+" IS ODD....!");
}
}
}