import java.util.*;

class Replace_zero_in_one{
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER WITH SOME ZERO : ");
            int x = sc.nextInt();
            String str = Integer.toString(x);
	    int len = str.length();
	    String str1 = "";
		for(int i = 0 ; i < len ; i++){
			if(str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);	
		}
		System.out.println("Output : "+str1);
           }

}