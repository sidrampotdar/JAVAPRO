import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        System.out.println("Inside the Main");
        Thread t= Thread.currentThread();
        System.out.print("THE MAIN THREAD: "+t);
        t.setName("TheMainThread");
        for(int i=0;i<20;i++){
            System.out.println(i);
          try{  t.sleep(100);

          if(i==4)
              throw new InterruptedException();

          }
          catch(InterruptedException e){
              System.out.println(e);

          }

        }
    }
}
