public class Main {
    public static void main(String[] args){
        Pismomalir p1 = new Pismomalir("Kokot");
        Pismomalir p2 = new Pismomalir("IVAN");
        Pismomalir p3 = new Pismomalir("Hovno");

        //metoda start hned sknočí, takže nechá kod jít dál ale k tomu pustí metodu run a nechá jí běžete během toho co program operuje dále
        System.out.println("START1");
        p1.start();
        System.out.println("START2");
        p2.start();
        System.out.println("START3");
        p3.start();
        System.out.println("kokot");

    }
}