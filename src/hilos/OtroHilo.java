package hilos;

import sun.tools.asm.CatchData;

public class OtroHilo implements Runnable {

    @Override
    public void run() {


        for (int i=0;i<20;i++){
            System.out.println("Hilo ANACLETUS: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
