import java.util.Scanner;

public class RoysPictureProblem {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int L=0,H=0,W=0,N=0;
        System.out.print("ENTER THE PHOTO SIZE : ");
        L = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF THE PICTURE : ");
        N = sc.nextInt();
        while (N != 0){
            System.out.println("ENTER THE WIDTH :");
            W = sc.nextInt();
            System.out.println("ENTER THE HEIGHT :");
            H = sc.nextInt();
            if(W<L || H<L)
                System.out.println("UPLOAD ANPTHER!");
            else {
                if(W == H)
                    System.out.println("ACCEPTED!");
                else
                    System.out.println("CROP IT!");
            }
            N--;
        }

    }
}
