import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("angka");
        int angka = scan.nextInt();
        System.out.println(" Faktor Bilangannya adalah :");

        // bilangan yang mau dicari = 10
        // cek
        for (int i = 1; i <= angka ; i++) {
            // kalau angka yang bisa bagi 10 dan gaada sisa maka termasuk faktor bilangan
            if (angka %i == 0)
                System.out.println(i);
        }
    }
}