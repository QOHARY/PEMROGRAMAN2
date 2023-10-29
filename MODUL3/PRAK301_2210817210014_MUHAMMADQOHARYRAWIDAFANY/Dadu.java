package MODUL3.PRAK301_2210817210014_MUHAMMADQOHARYRAWIDAFANY;

import java.util.LinkedList;
public class Dadu {
    private int total;

    public int getTotal() {
        return total;
    }
    public Dadu(int input) {
        acakNilai(input);
    }
    private void acakNilai(int input) {
        LinkedList<Integer> daduList = new LinkedList<>();
        int min = 1;
        int max = 6;

        for (int i = 0; i < input; i++) {
            int random_int = (int) (Math.random() * (max - min + 1) + min);
            daduList.add(random_int);
            total += random_int;
        }

        for (int i = 0; i < daduList.size(); i++) {
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + daduList.get(i));
        }

        System.out.println("Total Nilai Dadu Keseluruhan " + total);
    }
}