import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        int a=0,b=1,c,n;
        System.out.println("Enter the value of N:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(a+" "+b);
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(" "+c );
            a=b;
            b=c;

        }

    }

}
