import java.util.Scanner;

public class PRAK102_2210817210014_MuhammadQoharyRawidafany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int angkaAwal = input.nextInt();
        int jumlahDeret = 10; // Jumlah deret yang akan ditampilkan
        int i = 0;
        while (i <= jumlahDeret) {
            // Jika angka adalah kelipatan 5, maka kurangi 1, jika tidak, tampilkan angka aslinya
            int angka = (angkaAwal % 5 == 0) ? angkaAwal / 5 - 1 : angkaAwal;
            System.out.print(angka);
            // Tambahkan tanda koma jika bukan angka terakhir
            if (i <= jumlahDeret - 1) {
                System.out.print(",");
            }
            angkaAwal++; // Pindah ke angka berikutnya
            i++;
        }
        input.close();
    }
}