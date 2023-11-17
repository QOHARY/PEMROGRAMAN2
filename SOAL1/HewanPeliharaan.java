package SOAL1;

import java.util.Scanner;
public class HewanPeliharaan {
    private final String nama;
    private final String ras;

    public HewanPeliharaan() {
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Nama Hewan Peliharaan: ");
    this.nama = Scanner.nextLine();
    System.out.print("Ras: ");
    this.ras = Scanner.nextLine();
    }
    public void display (){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}
