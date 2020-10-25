import java.util.*;

class FACTOR_OF_A_NUMBER{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER : ");
int num = obj.nextInt();
System.out.println("FACTOR OF A NUMBER  :"+num+" ARE: ");
for(int i = 1 ; i <= num ; i++)
{
if(num % i == 0)
System.out.print(i+"	");
}
}
}