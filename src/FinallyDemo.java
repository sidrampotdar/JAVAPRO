import java.util.Scanner;

class FinallyDemo extends Exception
{
//    void div() throws ArithmeticException
//    {
//        int data=25/0;
//        System.out.println(data);
//    }
    FinallyDemo(String s){
        super(s);
    }
    public static void main(String args[]) {
//        FinallyDemo td=new FinallyDemo();
//            td.div();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            if (s.equals("MSBTE"))
                System.out.println("Correct");
            else
                throw new FinallyDemo("NOT VALID....");

        }

        catch(FinallyDemo f){
            System.out.println(f);
        }
    }
}