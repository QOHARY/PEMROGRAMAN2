package MODUL4.SOAL1;

public class HewanPeliharaan {
    private final String nama;
    private final String ras;

    public HewanPeliharaan(String n , String r) {
        this.nama = n;
        this.ras = r;
    }
    public void display (){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}