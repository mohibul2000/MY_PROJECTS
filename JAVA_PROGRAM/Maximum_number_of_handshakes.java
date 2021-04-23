import java.util.*;

class Maximum_number_of_handshakes{

     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER OF PERSON IN A ROOM : ");
            int n = sc.nextInt();
            int a = ((n*(n-1))/2);
            System.out.println("THE NUMBER OF HANDSHAKES ARE "+a);
        }
}