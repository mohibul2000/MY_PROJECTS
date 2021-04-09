//Java program to convert octal number to binary number

import java.util.Scanner;

public class Octal_To_Binary{
	public static void main(String args[]){      
		
		Scanner sc = new Scanner(System.in);    
		
		System.out.print("Enter a octal number : ");
		int octal = sc.nextInt();
		  
		int decimal = 0;
				
		int n = 0;  
		
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, n);  
			octal = octal/10;  
			n++;  
		}
		int binary[] = new int[20];
		int i = 0; 
		 
		while(decimal > 0)
		{       
			int r = decimal % 2;
			binary[i++] = r;
			decimal = decimal/2;
		}
		
		System.out.print("Binary number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(binary[j]+" "); 
		
		sc.close(); 
	}
}  