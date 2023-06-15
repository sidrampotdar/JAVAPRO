
class Run implements Runnable {
    public void run(){
        for(int i=0;i<=10;i++){

          try {System.out.println(i);
              Thread.sleep(100);
          }
          catch(InterruptedException e){

          }


        }

    }

}


public class RunnableEx {
    public static void main(String[] args) {
        Run r=new Run();
        Thread t=new Thread(r,"RUNTHRAD");
        t.start();


    }
}
