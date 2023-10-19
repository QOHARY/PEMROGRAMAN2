package MODUL2.PRAK201_2210817210014_MuhammadQoharyRawidafany;

import static java.lang.Math.floor;
public class BuahBuahan {
    String namaBuah;
    Double beratBuah;
    Double hargaBuah;
    Double jumlahBeli;
    Double diskon = 0.02; //Tetapan dari soal dan hitungannya per 4 Kg
    Double hargaSebelumDiskon;
    Double totalDiskon;
    Double hargaSetelahDiskon;

    public BuahBuahan(String namaBuah, Double beratBuah, Double hargaBuah, Double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.beratBuah = beratBuah;
        this.hargaBuah = hargaBuah;
        this.jumlahBeli = jumlahBeli;
        hargaSebelumDiskon = (jumlahBeli / beratBuah) * hargaBuah;
        totalDiskon = (floor(jumlahBeli/4))*(hargaBuah * diskon * 4);
        hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;
    }
    void display () {
        System.out.printf("Nama Buah: %s%n" , namaBuah);
        System.out.println("Berat : " + beratBuah);
        System.out.printf("Harga : %.1f%n" , hargaBuah);
        System.out.printf("Jumlah : %.1fkg %n" , jumlahBeli);
        System.out.printf("Harga Sebelum Diskon : Rp%.2f%n" , hargaSebelumDiskon);
        System.out.printf("Total Diskon : Rp%.2f%n" , totalDiskon);
        System.out.printf("Harga Setelah Diskon : Rp%.2f%n%n" , hargaSetelahDiskon);
    }
}
