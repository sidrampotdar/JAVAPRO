import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
      int a,b,c;
      a=5;
      c=0;
      Scanner sc= new Scanner(System.in);
      b=sc.nextInt();
      try{
          c=a/b;
      }
      catch(ArithmeticException e){
          System.out.println("plz enter valid input ; cant devide by 0");

      }
        System.out.println("c="+c);
    }
}