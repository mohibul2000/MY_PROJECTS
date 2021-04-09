//Java program to convert Binary number to decimal number

import java.util.*;
class Example{
      int x;
      void print(int x){
       int deci = 0;
       int n = 0;  
       while(x > 0){
			int temp = x%10; 
			deci += temp*Math.pow(2, n);  
			x = x/10;  
			n++;  
		}
		System.out.println("Decimal number : "+deci); 
       }

}
public class Binary_To_Decimal{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the Binary Number : ");
           int x = sc.nextInt();
           Example obj = new Example();
           obj.print(x);
	   sc.close();
         }
}