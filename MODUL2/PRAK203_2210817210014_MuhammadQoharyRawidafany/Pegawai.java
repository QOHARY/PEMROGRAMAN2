package MODUL2.PRAK203_2210817210014_MuhammadQoharyRawidafany;

// Public class yang digunakan salah karena menggunakan "Employee" yang seharusnya menggunakan class "Pegawai" biar dapat terhubung dengan main.
//public class Employee {
public class Pegawai {
    public String nama;
    //Type Data yang digunakan pada asal, memerlukan type data String
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //Tidak dapat dirun dikarenakan Setter membutuhkan Arugmen
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
