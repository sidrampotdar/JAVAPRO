public class MultipleCatch {
    public static void main(String [] args){
        int i,j,k=0;

        int[] a=new int[5];
        i=30;
        j=0;



        try{
            k=i/j;
            for(int c=-1;c<5;c++)
                a[c]=c;

        }
        catch(ArithmeticException e){
            System.out.println("CAN'T DIVIDE BY ZERO..ERROR");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException s){
            System.out.println("INVALID ARRAY INDEX");
            System.out.println(s);
        }
        System.out.println("result:"+k);

    }
}
