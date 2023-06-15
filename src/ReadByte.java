import java.io.*;
class ReadByte
{
    public static void main(String args[])
    {
        try
        { FileInputStream fis=new FileInputStream("myfile.txt");

            FileOutputStream fos=new FileOutputStream("file1.txt");
            int b=0;
            while(b!=-1)
            {
                b=fis.read();
                fos.write(b);
            }
            System.out.println("File copied Successfully");
            fis.close();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println("ERROR >>>>>>>"+e);
        }
    }
}
