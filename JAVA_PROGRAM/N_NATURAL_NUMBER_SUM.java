import java.util.*;

class N_NATURAL_NUMBER_SUM{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int sum = 0;
System.out.print("ENTER YOUR NUMBER: ");
int num = obj.nextInt();
for(int i=1;i<=num;i++)
sum = sum + i;
System.out.println("Sum of first N natural numbers = "+sum);
}
}