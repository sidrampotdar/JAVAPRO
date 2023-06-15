public class DemoExeption {
    public static void main(String [] args){
        int i,j,k=0;
        i=0;
        j=25;
       try{
           k=j/i;
       }
       catch(ArithmeticException e){
           System.out.println("ERROR....DIVIDE BY ZERO");
           System.out.println(e);
        }
        System.out.println("div=" + k);
    }
}
