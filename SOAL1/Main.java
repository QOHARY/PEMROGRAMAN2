package SOAL1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama Hewan :");
        String nama = scanner.nextLine();
        System.out.print("Ras: ");
        String ras = scanner.nextLine();
        HewanPeliharaan hewanPeliharaan = new HewanPeliharaan(nama,ras);
        hewanPeliharaan.display();
    }
}
