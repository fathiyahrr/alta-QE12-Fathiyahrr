import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // bilangan prima > 1
    // Faktor pembaginya = bilangan prima
    public static void main(String[] args) {
        System.out.println(primeNumber(7));
        System.out.println(primeNumber(10));
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(28));
        System.out.println(primeNumber(35));
    }
    private static boolean primeNumber (int angka ) {
        boolean prima = true;
        if (angka < 1) prima = false;
        for (int i = 1; i <= angka; angka++)
            if (i%angka  == 0)
                prima = false;

        return prima;
    }
}


