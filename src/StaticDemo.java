class Maths{
    static double PI=3.14;
    static void display(){
        System.out.println("THE STATIC METHOOD CALLED");
    }


}


public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("THE VALUE OF PI: "+Maths.PI);
        Maths.display();
    }


}
