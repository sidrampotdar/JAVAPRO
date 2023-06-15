import jdk.swing.interop.SwingInterOpUtils;

class Parent{
    Parent(){
        System.out.println("Parent Constructor is Called.....");
    }
    void display(){
        System.out.println("THIS IS PARENT CLASS.....");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor is Called.....");
    }
    void display(){
        System.out.println("THIS IS CHILD CLASS.....");
    }
}

public class DynamicDispatch
{
    public static void main(String[] args) {
//        Parent p=new Parent();
//        p.display();
//        Child c=new Child();
//            c.display();
//            p=c;
//            p.display();
            Parent p2=new Child();
            p2.display();
    }
}
