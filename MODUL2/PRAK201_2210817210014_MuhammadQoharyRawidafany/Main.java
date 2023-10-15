package MODUL2.PRAK201_2210817210014_MuhammadQoharyRawidafany;

public class Main {

    public static void main(String[] args) {
        BuahBuahan Apel = new BuahBuahan("Apel", 0.4, 7000.0, 40.0);
        BuahBuahan Mangga = new BuahBuahan("mangga", 0.2, 3500.0, 15.0);
        BuahBuahan Alpukat = new BuahBuahan("Alpukat", 0.25, 10000.0, 12.0);
        Apel.display();
        Mangga.display();
        Alpukat.display();
    }
}
