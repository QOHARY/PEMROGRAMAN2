import java.util.Scanner;

public class PRAK101_2210817210014_MuhammadQoharyRawidafany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        // Menampilkan output sesuai dengan format
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan(bulanLahir) + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

        input.close();
    }

    // Fungsi untuk mengonversi nomor bulan menjadi nama bulan
    public static String namaBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan - 1];
    }
}
