package hilos;

public class HiloPropio extends Thread {


    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("Hilo ANACLETUS: " + i);

        }
    }
}
