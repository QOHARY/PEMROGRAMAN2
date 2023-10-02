import java.util.Scanner;

public class PRAK104_2210817210014_MuhammadQoharyRawidafany {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Tangan Abu: ");
        String Abu = input.nextLine();
        System.out.print("Tangan Bagas:");
        String Bagas = input.nextLine();

        int PoinAbu = 0, PoinBagas = 0;
        for (int q = 0; q <= Abu.length(); q +=2){
            if(Abu.charAt(q)=='G' &&Bagas.charAt(q)=='B'
            ||Abu.charAt(q)=='K' &&Bagas.charAt(q)=='G'
            ||Abu.charAt(q)=='B' &&Bagas.charAt(q)=='K') {
                    PoinBagas++;
                }
            else if (Abu.charAt(q)=='B' &&Bagas.charAt(q)=='G'
            ||Abu.charAt(q)=='G' &&Bagas.charAt(q)=='K'
            ||Abu.charAt(q)=='K' &&Bagas.charAt(q)=='B'){
                    PoinAbu++;
            }
        }
        String pemenang;
        if (PoinAbu > PoinBagas) {
            pemenang = "Abu";
            System.out.println(pemenang);
        } else if (PoinBagas > PoinAbu) {
            pemenang = "Bagas";
            System.out.println(pemenang);
        } else {
            pemenang = "Seri";
            System.out.println(pemenang);
        }
        input.close();
    }
}