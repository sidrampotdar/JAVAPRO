class Even extends Thread{
 public    void run(){
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
            try{
                Thread.sleep(00);

            }
            catch(InterruptedException e){
                System.out.println("Interrupted EXception Raised ....");

            }
        }
    }
}
class Odd extends Thread{
    public    void run(){
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println("Odd: "+i);
            }
            try{
                Thread.sleep(00);

            }
            catch(InterruptedException e){
                System.out.println("Interrupted EXception Raised ....");

            }
        }
    }
}


public class EvenOddThread {
    public static void main(String[] args) {
        Even E= new Even();
        Odd O = new Odd();
        E.start();
        try {
            E.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        O.start();
    }
}
