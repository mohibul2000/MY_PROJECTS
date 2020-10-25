import java.util.*;

class FACTORIAL{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER THE NUMBER: ");
int num = obj.nextInt();
if(num >= 0)
{
int fac=1;
for(int i=num; i>=1; i--)
fac = fac*i;
System.out.println("FACTORIAL OF NUMBER "+num+" is "+fac);
}
else
    System.out.println("PLEASE ENTER VALID NUMBER.......!");
}

}