public class Main {
    public static void main(String[] args){
        Pismomalir p1 = new Pismomalir("Honza", "AHOJ");
        Pismomalir p2 = new Pismomalir("Pepa", "HALLO");

        Cislomalir c1 = new Cislomalir("Eukleidus", 888);
        Cislomalir c2 = new Cislomalir("Marcus Aurelius", 800);
        Cislomalir c3 = new Cislomalir("Aristoteles", 700);


        //metoda start hned sknočí, takže nechá kod jít dál ale k tomu pustí metodu run a nechá jí běžete během toho co program operuje dále
        System.out.println("radek 10");
        //p1.start();
        System.out.println("radek 12");
        //p2.start();
        System.out.println("radek 14");
        c1.start();
        c2.start();
        c3.start();



    }

}
