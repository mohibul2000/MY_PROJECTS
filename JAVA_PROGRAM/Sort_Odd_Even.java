import java.util.Scanner;

public class Sort_Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int temp,c=0,k,j;
        for(int i=0; i<=n-1; i++){
            a[i] = sc.nextInt();
            if(a[i]%2==1) {
                c++;
            }
        }
        for(int i=0; i<n-1; i++) {
            for(j=0; j<n-i-1; j++) {
                if(a[j]>a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        k=0;
        j=n-c;
        for(int i=0; i<n; i++) {
            if(a[i]%2==0) {
                if(k < n-c)
                    b[k++]=a[i];
            }
            else {
                if(j < n)
                    b[j++]=a[i];
            }
        }
        for(int i=0; i<n; i++) {
            a[i]=b[i];
            System.out.println(a[i]);
        }
    }
}
