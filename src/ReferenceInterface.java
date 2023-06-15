public class ReferenceInterface {
    public static void main(String args[])
    {

        Message md=new Demo ();
        md.msg();
        System.out.println(md);

        md=new INTDemo();
        md.msg();
        System.out.println(md);
        System.out.println(INTDemo.a);
    }
}
interface Message
{       int a=30;
    void msg();
}
class Demo implements Message
{
    public void msg()
    {
        System.out.println("Hello nested interface");
    }

}
class INTDemo implements Message
{
    public void msg()
    {
        System.out.println("Hello INTDEMO interface");
    }

}