import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("lion"));

    }
        private static boolean palindrome (String value ) {
            //input rumus
            //if () {
            //    System.out.println("kata tersebut adalah palindrom");
            //} else
            //    System.out.println("kata tersebut bukan palindom");
            Scanner input = new Scanner(System.in);

            String kata;
            String kataPalindrome = "";
            int panjangKata = kata.length();

            System.out.println("Masukan Kata untuk dicek: ");
            kata = input.nextLine();
            System.out.println("Masukan panjang kata :");
            panjangKata = kata.length();

            for (int i = 1; 1>=0 ; i--) {
                kataPalindrome = kataPalindrome + kata.charAt(i);
            }
            if (kata.equals (kataPalindrome)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

        }

}