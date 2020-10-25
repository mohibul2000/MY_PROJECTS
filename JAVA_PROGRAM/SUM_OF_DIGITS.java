import java.util.*;

class SUM_OF_DIGITS{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER: ");
int num = obj.nextInt();
int temp=0;
while(num != 0)
{
int last_number = num % 10;
temp = temp + last_number;
num = num / 10;
}
System.out.println("SUM OF DIGITS IS...."+temp);
}
}