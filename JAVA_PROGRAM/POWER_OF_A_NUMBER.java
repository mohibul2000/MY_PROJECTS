import java.util.*;

class POWER_OF_A_NUMBER{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER : ");
int num = obj.nextInt();
System.out.print("ENTER YOUR NUMBER OF EXPONENT : ");
int exp = obj.nextInt();
int pow = 1;
while (exp != 0)
                {
                    pow = pow * num;
                    --exp;
                }
System.out.println("POWER OF A NUMBER IS : "+pow);
}
}