package MODUL3.PRAK301_2210817210014_MUHAMMADQOHARYRAWIDAFANY;

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahDadu = input.nextInt();
        int total = 0;
        LinkedList<Dadu>simpandadu = new LinkedList<>();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.acakNilai());
            total += dadu.getMataDadu();
            simpandadu.add(dadu);
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}