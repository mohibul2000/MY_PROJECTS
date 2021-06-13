/*
  TOGGLE STRING:
             IP: HeLlo;
             OP: hElLO;
 */



import java.util.Scanner;

public class ToggleClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);

        for(int i =0 ; i< s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                s.replace(i,i+1,String.valueOf(c).toLowerCase());
            }
            else{
                s.replace(i,i+1,String.valueOf(c).toUpperCase());
            }
        }
        System.out.print("OUR REQUIRED OUTPUT IS : ");
        System.out.print(s);

    }
}
