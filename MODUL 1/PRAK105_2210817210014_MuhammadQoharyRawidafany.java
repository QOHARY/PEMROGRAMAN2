import java.util.Scanner;
import java.text.DecimalFormat; // Import kelas DecimalFormat

public class PRAK105_2210817210014_MuhammadQoharyRawidafany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PHI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        // Menghitung volume tabung
        double volume = PHI * jariJari * jariJari * tinggi;

        // Menggunakan DecimalFormat untuk membatasi jumlah desimal menjadi 3
        DecimalFormat df = new DecimalFormat("#.###");
        String formattedVolume = df.format(volume);

        System.out.println("Volume tabung dengan jari-jari " + jariJari + " cm dan tinggi " + tinggi + " cm adalah " + formattedVolume + " m3");

        input.close();
    }
}