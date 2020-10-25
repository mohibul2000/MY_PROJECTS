import java.util.*;

class FIBONACCI{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER: ");
int a = obj.nextInt();
if(a>0)
{
int x=0,y=1,z;
System.out.println("FIBONACCI SERIES : "+x+" "+y+" ");
while(y <= a)
{
z=x+y;
x=y;
y=z;
if(y<=a)
    System.out.println(y+" ");
}
}
else
    System.out.println("WRONG INPUT...... ");
}
}