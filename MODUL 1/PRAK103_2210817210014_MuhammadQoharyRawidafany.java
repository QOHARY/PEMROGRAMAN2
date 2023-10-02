import java.util.Scanner;

public class PRAK103_2210817210014_MuhammadQoharyRawidafany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" ");
        int N = input.nextInt();
        int bilanganAwal = input.nextInt();

        int i = 1;
        int bilangan = bilanganAwal;

        System.out.print("Deret bilangan: ");
        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);
                if (i < N) {
                    System.out.print(", ");
                }
                i++;
            }
            bilangan++;
        } while (i <= N);

        input.close();
    }
}