package MODUL2.PRAK202_2210817210014_MuhammadQoharyRawidafany;

public class Kopi {
    String namaKopi;
    String ukuran;
    Integer harga;
    String pembeli;
    double pajak;

    //Konstruktornya
    public Kopi(){
        pajak = 0.11;
    }
    public void setPembeli(String nama){
        pembeli = nama;
    }
    public String getPembeli(){
        return pembeli;
    }
    public double getPajak(){
        return harga * pajak;
    }
    public void info(){
        System.out.println("Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
}

