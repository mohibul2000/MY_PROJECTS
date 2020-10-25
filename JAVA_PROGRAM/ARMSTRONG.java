import java.util.*;

class ARMSTRONG{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER: ");
int num = obj.nextInt();
int sum = 0;
int temp = num;
while(num != 0)
{
int last_number = num % 10;
sum = sum + (last_number * last_number * last_number);
num = num / 10;
}
if(sum == temp){
System.out.println(temp+" IS ARMSTRONG");
}
else{
System.out.println(temp+" IS NOT ARMSTRONG");
}
}
}