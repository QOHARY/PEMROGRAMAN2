package SOAL2;

public abstract class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan (String NamaHewan, String Ras){
    this.nama = NamaHewan;
    this.ras = Ras;
    }
    public void display (){
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaan: " + this.nama);
        System.out.println("Ras : " + this.ras);
    }
}
class Kucing extends HewanPeliharaan{
    private String warnaBulu;

    public Kucing (String r, String n, String w){
        super (r,n);
        this.warnaBulu = w;
    }
    public void displayDetailKucing () {
        super.display();
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}

class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String kemampuan;

    public Anjing (String n, String r, String w, String k){
        super (n,r);
        this.warnaBulu = w;
        this.kemampuan = k;
    }
    public void displayDetailAnjing () {
        super.display();
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println("Kemampuan: " + this.kemampuan);
    }
}