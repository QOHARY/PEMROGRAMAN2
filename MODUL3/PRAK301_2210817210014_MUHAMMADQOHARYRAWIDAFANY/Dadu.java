package MODUL3.PRAK301_2210817210014_MUHAMMADQOHARYRAWIDAFANY;

import java.util.Random;
class Dadu {
    private int maxSisiDadu = 6;
    private int nilai;
    private Random random = new Random();

    public int acakNilai() {
        this.nilai = random.nextInt(maxSisiDadu) + 1;
        return nilai;
    }
    public int getMataDadu() {
        return nilai;
    }
}