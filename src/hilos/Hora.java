package hilos;

public class Hora implements Runnable{

    private int min = 0;
    private int seg = 0;
    private int hour = 0;
    private String hora ="";

    @Override
    public void run() {
        while(true){

            seg++;

            if(seg==59){
                seg=0;
                min++;

                if(min==59){
                    min=0;
                    hour++;

                    if (hour ==23) {
                        hour=0;
                        min=0;
                        seg=0;

                    }
                }
            }


//            hora =  (hour<10) ? ("0").concat(String.valueOf(hour)) : String.valueOf(hour);
//            hora +=  (min<10) ? (":0").concat(String.valueOf(min)) : (":").concat(String.valueOf(min));
//            hora +=  (seg<10) ? (":0").concat(String.valueOf(seg)) : (":").concat(String.valueOf(seg));


            System.out.println(String.format("%02d:%02d:%02d",hour,min,seg));


            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



    }
}
