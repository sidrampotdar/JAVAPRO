import java.util.Scanner;

class Student{
    int id;
    String name;
    void setdata(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The ID:");
        id=sc.nextInt();
        System.out.println("Enter the Name: ");
        name=sc.next();
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
    int getId(){
        return id;
    }
}

class NegativeIdException extends Exception{
    NegativeIdException(String s){
        super(s);
    }
}

public class StudentNegId {
    public static void main(String[] args) {


    Student[] s = new Student[5];
        for(int i = 0;i<5;i++)

    {
        s[i]=new Student();
        s[i].setdata();
        int tempId = s[i].getId();
        try {
            if (tempId < 0) {
                throw new NegativeIdException("INVALID ID....");

            }
        } catch (NegativeIdException e) {
            System.out.println(e.getMessage());
        }
    }

}

}
