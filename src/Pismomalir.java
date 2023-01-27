public class Pismomalir extends Thread{
    String napis;

    public Pismomalir(String napis) {
        this.napis = napis;
    }

    @Override
    public void run() {
        for (char ch:napis.toCharArray()) {
            System.out.println(ch);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //nastala vyjímka a my jen skončíme
                return;
            }
        }
    }
}
