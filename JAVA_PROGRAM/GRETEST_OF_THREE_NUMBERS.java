import java.util.*;

class GRETEST_OF_THREE_NUMBERS{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER 1ST NUMBER: ");
int a = obj.nextInt();
System.out.print("ENTER 2ND NUMBER: ");
int b = obj.nextInt();
System.out.print("ENTER 3RD NUMBER: ");
int c = obj.nextInt();
if(a>b && a>c){
System.out.println(a+" IS GREATER....!");
}
else if(b>c){
System.out.println(b+" IS GREATER....!");
}
else{
System.out.println(c+" IS GREATER....!");
}
}
}