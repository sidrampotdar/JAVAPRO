class test0 {
    public interface INT{
        void show();
    }
}
class TEST0 implements test0.INT {
    public  void show(){
        System.out.println("HELLO WORLD");
    }
}
public class NastedInterfaceUsingClass {
    public static void main(String[] args) {
        TEST0 t=new TEST0();
        t.show();
        t.show();
    }

}


