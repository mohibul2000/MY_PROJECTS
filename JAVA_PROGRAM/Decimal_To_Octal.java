//Java program to convert decimal number to octal number

import java.util.Scanner;

public class Decimal_To_Octal{
	public static void main(String args[]){   
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter a Decimal number : ");
		int decimal = sc.nextInt();
		
		int octal[] = new int[20];
		int i = 0; 
		
		while(decimal > 0)
		{       
			int r = decimal % 8;
			octal[i++] = r;
			decimal = decimal/8;
		}
		
		System.out.print("Octal number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(octal[j]);
		
		sc.close();
	}
}  