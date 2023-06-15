import java.util.Scanner;

class NegativeSalaryException extends Exception{
    NegativeSalaryException(String s){
        super(s);

    }
}


public class ValidateSalary {
    public static void main(String[] args) {
        String name;
        int sal;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Name:" );
        name=sc.nextLine();
        System.out.println("Enter the Salary");
        sal=sc.nextInt();
        try{
            if(sal<0)
                throw new NegativeSalaryException("INVALID SALARY");
            else
                System.out.println("VALID INPUT");

        }
        catch(Exception e){
            System.out.print(e);
        }

    }
}
