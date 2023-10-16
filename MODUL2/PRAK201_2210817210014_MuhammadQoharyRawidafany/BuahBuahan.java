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
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat : " + beratBuah);
        System.out.println("Harga : " + hargaBuah);
        System.out.println("Jumlah : " + jumlahBeli);
        System.out.println("Harga Sebelum Diskon : " + hargaSebelumDiskon);
        System.out.println("Total Diskon : " + totalDiskon);
        System.out.println("Harga Setelah Diskon : " + hargaSetelahDiskon + "\n");
    }
}
