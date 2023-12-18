package MODUL4.SOAL2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:\n1 = Kucing\n2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = Scanner.nextInt();
        Scanner.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String nama = Scanner.nextLine();
        System.out.print("Ras: ");
        String ras = Scanner.nextLine();
        System.out.print("Warna Bulu: ");
        String warnaBulu = Scanner.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(ras, nama, warnaBulu);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            System.out.print("Memiliki kemampuan: ");
            String[] kemampuan = Scanner.nextLine().split(", ");
            Anjing anjing = new Anjing(ras, nama, warnaBulu, kemampuan);
            anjing.displayDetailAnjing();
        }
        Scanner.close();
    }
}