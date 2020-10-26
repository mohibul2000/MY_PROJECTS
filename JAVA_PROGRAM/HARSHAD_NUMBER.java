import java.util.Scanner;

public class HARSHAD_NUMBER{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");				
int number = sc.nextInt();
int n = number;
int result = 0;
while(n != 0)
{
int pick_last = n % 10;
result = result + pick_last;
n = n / 10;
}
if(number % result == 0)
	System.out.println("Harshad Number");
else
	System.out.println("Not a Harshad Number");
}
}