package MODUL2.PRAK203_2210817210014_MuhammadQoharyRawidafany;

public class Soal3Main {
    public static void main(String[] args) {
        //Terdapat error sebelumnya karena pada nama file class, bernama Employee yang seharusnya adalah "Pegawai", maka diganti nama class Employee
        Pegawai p1 = new Pegawai();
        //Terdapat error karena tidak mempunyai tanda " ; "
        //p1.nama = "Roi"
        p1.nama = "Roi";
        //Terdapat error sebelumnya karena pada class bertype data char, maka caranya agar bisa adalah dengan mengganti type data menjadi "String"
        p1.asal = "Kingdom of Orvel";
        //Terjadi kesalahan pada output yang mana pada umur tidak memiliki nilai, karena umur belum dilakukan set
        p1.umur = 17;
        p1.setJabatan("Assasin");
        //Perbedaan output pada Nama Pegawai yang seharusnya hanya Nama
        //System.out.println("Asal: " + p1.getAsal());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Perbedaan output pada hasil print Umur dikarenakan tidak ada kalimat "Tahun" setelah melakukan pengambilan data, maka
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
