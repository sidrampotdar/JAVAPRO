import java.io.*;

class CountChar
{
    public static void main(String args[])
    {           int cl,cs,cch;
        cl=cs=cch=0;

        try
        {
            FileReader fr=new FileReader("myfile.txt");

          char tempc;
            int ch=0;
            while(ch!=-1)
            {    if(cl==0)
                cl=1;
                ch=fr.read();
                tempc = (char)ch;
                switch(tempc){
                    case ' ' :
                        cs++;
                        break;
                    case '\n':
                        cl++;
                        break;
                    default:
                        cch++;


                }
            }

            System.out.println("char="+cch);
            System.out.println("lines="+cl);
            System.out.println("space="+cs);
            fr.close();

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
