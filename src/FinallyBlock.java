public class FinallyBlock {
    public static void main (String [] args){
        int i,j,k=0;
        i=5;
        j=5;
        try{
            k=i/j;


        }


        catch (Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("output:"+k);
        }


    }

}
