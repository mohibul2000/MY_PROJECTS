import java.util.*;

class Positive_Negative{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER: ");
int num = obj.nextInt();
if(num >= 0){
System.out.println(num+" is positive....!");
}
else{
System.out.println(num+" is negative....!");
}
}
}