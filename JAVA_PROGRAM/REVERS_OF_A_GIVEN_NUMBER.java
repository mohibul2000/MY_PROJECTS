import java.util.*;

class REVERS_OF_A_GIVEN_NUMBER{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER: ");
int num = obj.nextInt();

String a = "";
while(num != 0)
{
int last_number = num % 10;
a = a + Integer.toString(last_number);
num = num / 10;
}
System.out.println("REVERS_OF_A_GIVEN_NUMBER IS = "+a);
}
}