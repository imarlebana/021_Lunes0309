import hilos.HiloPropio;

public class Test {

    public static void main(String[] args) {


        HiloPropio hp = new HiloPropio();
        hp.start();

        for (int i=0;i<100;i++){
            System.out.println("Hilo KING: " + i);

        }
    }
}
