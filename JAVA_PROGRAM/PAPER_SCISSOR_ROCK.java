import java.util.*;

class PAPER_SCISSOR_ROCK{

public static void main(String[] args){

Scanner obj = new Scanner(System.in);

System.out.println("PAPER:1  ROCK:2  SCISSOR:3....!");
System.out.print("ENTER NUMBER FOR YOUR CHOICE 1st PLAYER: ");
int a = obj.nextInt();

System.out.println("PAPER:1  ROCK:2  SCISSOR:3....!");
System.out.print("ENTER NUMBER FOR YOUR CHOICE 2nd PLAYER: ");
int b = obj.nextInt();

if(a==1 && b==2){
System.out.println("PAPER WIN THE GAME....!");
}
else if(a==1 && b==3){
System.out.println("SCISSOR WIN THE GAME....!");
}
else if(a==2 && b==3){
System.out.println("ROCK WIN THE GAME....!");
}
else if(a==2 && b==1){
System.out.println("PAPER WIN THE GAME....!");
}
else if(a==3 && b==1){
System.out.println("SCISSOR WIN THE GAME....!");
}
else if(a==3 && b==2){
System.out.println("ROCK WIN THE GAME....!");
}
else{
System.out.println("wrong input....!");
}
obj.close();
}
}