class Primary{
    int x;
    final double PI=3.14;
    Primary(int a){
        x=a;
    }
    void disp(){
        System.out.println("Value Of X: "+x);
        System.out.println("Value Of PI: "+PI);
    }

}
class Secondery extends Primary{
    double area;
    Secondery(int a){
        super(a);
    }
    void cal(){
       area=(double)(super.PI* super.x*super.x);
    }
    void display(){
        super.disp();
        System.out.println("Area: "+area);
    }
}


public class SuperDemo {
    public static void main(String[] args) {
        Secondery sc=new Secondery(10);
        sc.cal();
        sc.display();

    }
}
