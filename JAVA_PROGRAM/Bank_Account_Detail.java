import java.util.*;

class Account{

int x,num1;
int total_money = 0;

Account(){
      x = num1;
     
}
void Initial_Value(){
     System.out.println("YOUR CURRENT BALANCE IS : 1000");
}
void Deposite_Money(int x){
     total_money = 1000 + x;
     System.out.println("YOU DEPOSITE "+x);
     System.out.println("YOUR CURRENT BALANCE IS : "+total_money);
}
void Withdraw_Money(int x){
     total_money = 1000 - x;
     System.out.println("YOU WITHDRAW "+x);
     System.out.println("YOUR CURRENT BALANCE IS : "+total_money);
}
void Display_Account_Detail(){
     System.out.println("YOUR ACCOUNT NAME IS : MOHIBUL AKTAR MOLLAH");
     System.out.println("YOUR ACCOUNT NUMBER IS : 100001");
     System.out.println("YOUR CURRENT BALANCE IS : 1000");
}
}

public class Bank_Account_Detail{
public static void main(String[] args){
Account obj1 = new Account();
Scanner obj2 = new Scanner(System.in);
System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
int y = obj2.nextInt();
if(y == 100001){
System.out.println("1-to know Initial_Value...");
System.out.println("2-Deposite_Money... ");
System.out.println("3-Withdraw_Money... ");
System.out.println("4-Display_Account_Detail... ");
int c =obj2.nextInt();
switch(c){
case 1:
       obj1.Initial_Value();
       break;
case 2:
       System.out.print("ENTER YOUR AMMOUNT WHICH YOU CAN DEPOSITE : ");
       int a = obj2.nextInt();
       obj1.Deposite_Money(a);
       break;
case 3:
       System.out.print("ENTER YOUR AMMOUNT WHICH YOU CAN WITHDRAW : ");
       int b = obj2.nextInt();
       obj1.Withdraw_Money(b);
       break;
case 4:
       obj1.Display_Account_Detail();
       break;
}
}
else
{
System.out.println("..WRONG ACCOUNT NUMBER..");
}
}
}