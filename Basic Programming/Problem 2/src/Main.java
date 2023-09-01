import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 80 sampai 100 = A
        // 65 sampai 79 = B+
        // 50 sampai 64 = B
        // 35 sampai 49 = C
        // 0 sampai 34 = D

        // > 100 = invalid
        // < 0 = invalid

        Scanner input = new Scanner(System.in);
        System.out.println("Input Nilai Angka :");
        int NilaiNumber = input.nextInt();
        String NilaiHuruf;

        if (NilaiNumber >= 80 && NilaiNumber <= 100) {
            NilaiHuruf = "A";
        } else if (NilaiNumber >= 65 && NilaiNumber <= 79) {
            NilaiHuruf = "B+";
        } else if (NilaiNumber >= 50 && NilaiNumber <= 64) {
            NilaiHuruf = "B";
        } else if (NilaiNumber >= 35 && NilaiNumber <= 49) {
            NilaiHuruf = "C";
        } else if (NilaiNumber >= 35 && NilaiNumber <= 49) {
        NilaiHuruf = "D";
        } else  {
            NilaiHuruf = "invalid";
        }

        System.out.println("Nilai Huruf Mahasiswa adalah " + NilaiHuruf );

    }
}