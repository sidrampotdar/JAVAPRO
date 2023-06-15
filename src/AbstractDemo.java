abstract class ABC{
    abstract void show();
    void display(){
        System.out.println("THE ABC CLASS CONCRETE METHOD IN ABSTRACT CLASS");
    }

}

class XYZ extends ABC{
    void show(){
        System.out.println("THE SHOW METHOD IMPLEMENTED.....");
    }
    void disp(){
        System.out.println("METHOD XYZ CALLED");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        XYZ X=new XYZ();
        X.display();
        X.show();
        X.disp();

    }
}
