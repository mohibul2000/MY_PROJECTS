import java.util.*;

class PALINDROME{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER: ");
        int num = obj.nextInt();
        int temp = num;
        String a = "";
        while(num != 0)
        {
            int last_number = num % 10;
            a = a + Integer.toString(last_number);
            num = num / 10;
        }
        int b = Integer.parseInt(a);
        if(b==temp){
            System.out.println(temp+" IS PALINDROME...! ");
        }
        else{
            System.out.println(temp+" IS NOT PALINDROME...! ");
        }
    }
}
