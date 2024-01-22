
public class MetodoStop {
    public static void main(String[] args) {
        Examen Examen = new Examen();
        Thread hilo = new Thread(Examen);
        hilo.start();

        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Examen.stop();
    }
}