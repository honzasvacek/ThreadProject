public class Cislomalir extends Thread{
    int max;

    public Cislomalir(String jmeno, int max) {
        super(jmeno);
        this.max = max;
    }

    @Override
    public void run() {
        if (cislo < 10){
            for (int i = 0; i < max; i++) {
                System.out.println("CisloMalir " + getName() + " napsal: " + i);
                cislo ++;
            }
        } else {
                Thread.yield();
                cislo --;
        }

    }

    static int cislo;
}
