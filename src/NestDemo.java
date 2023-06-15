interface Test1
{
    interface Message
    {
        void msg();
    }
}
    class NestDemo1 implements Test1.Message
        {

         public void msg()
        {
        System.out.println("Hello nested interface");
        }
        }
        class NestDemo{
public static void main(String args[])
        {
        NestDemo1 nd=new NestDemo1 ();
        nd.msg();
        }
        }