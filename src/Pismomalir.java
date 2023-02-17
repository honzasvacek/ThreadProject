public class Pismomalir extends Thread{
    String napis;

    public Pismomalir(String jmeno, String napis) {
        super(jmeno);
        this.napis = napis;
    }

    public void run() {
        for (char ch:napis.toCharArray()) {
            System.out.println("PismoMalir " + getName() + " napsal: " + ch);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //nastala vyjímka a my jen skončíme
                return;
            }
        }
    }

}
