import java.util.*;

class SUM_OF_RANGE_GIVEN_NUMBER{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int sum = 0;
System.out.print("ENTER YOUR  1st RANGE: ");
int num1 = obj.nextInt();
System.out.print("ENTER YOUR  2nd RANGE: ");
int num2 = obj.nextInt();
for(int i=num1;i<=num2;i++)
sum = sum + i;
System.out.println("Sum of numbers in a given range = "+sum);
}
}