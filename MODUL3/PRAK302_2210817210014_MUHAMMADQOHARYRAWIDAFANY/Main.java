package MODUL3.PRAK302_2210817210014_MUHAMMADQOHARYRAWIDAFANY;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();
        input.nextLine();
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        for (int q = 1; q <= nilai; q++) {
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();


            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = input.nextInt();
                bulanKemerdekaan = input.nextInt();
                tahunKemerdekaan = input.nextInt();
                input.nextLine();
            }
            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }
        for (Negara negara : negaraList) {
            int tanggalKemerdekaan = negara.getTanggalKemerdekaan();
            int bulanKemerdekaan = negara.getBulanKemerdekaan();
            int tahunKemerdekaan = negara.getTahunKemerdekaan();
            String jenisKepemimpinan = negara.getJenisKepemimpinan();
            String nama = negara.getNama();
            String namaPemimpin = negara.getNamaPemimpin();
            String namaBulan = bulanMap.get(bulanKemerdekaan);

            System.out.print("Negara " + nama + " mempunyai ");
            switch (jenisKepemimpinan) {
                case "presiden":
                    System.out.print("Presiden");
                    break;
                case "perdana menteri":
                    System.out.print("Perdana Menteri");
                    break;
                default:
                    System.out.print("Raja");
                    break;
            }
            System.out.println(" bernama " + namaPemimpin);

            if (!jenisKepemimpinan.equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + namaBulan + " " + tahunKemerdekaan);
            }
            System.out.println();
        }
    }
}