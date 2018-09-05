import hilos.HiloPropio;
import hilos.Hora;
import hilos.OtroHilo;

public class Test {

    public static void main(String[] args)  {

//        HiloPropio hp = new HiloPropio();
//        hp.start();
//
//
//        Thread th = new Thread(new OtroHilo());
//        th.start();
//
//
////        for (int i=0;i<100;i++){
////            System.out.println("Hilo KING: " + i);
////
////        }
//
//        Runnable r = () -> {
//            for (int i=0;i<20;i++){
//                System.out.println("Hilo ANACLETUS: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };


        Thread th = new Thread(new Hora());
        th.start();

        int count = 0;
        while(true){
            count++;
            if(count==100){
                try {
                    th.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if (count==200){
                th.notify();
            }

        }


//



    }
}
