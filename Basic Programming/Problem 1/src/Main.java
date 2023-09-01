import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     //   Scanner input = new Scanner(System.in);
     // System.out.println("Input nilai alas : ");
     //   double alasInput = input.nextInt();
     //   System.out.println("input nilai tinggi : ");
     //   double tinggiInput = input.nextInt();

     //   double luashasil = (alasInput * tinggiInput *0.5);
     //   System.out.println("Hasil Luas Segitiga input user = " + luashasil);

        //input
        Scanner input = new Scanner(System.in);
        System.out.println("input nilai alas segitiga :");
        double alasSegitiga = input.nextDouble();
        System.out.println("input nilai tinggi segitiga :");
        double tinggiSegitiga = input.nextDouble();


        double luasSegitiga = (alasSegitiga * tinggiSegitiga/2) ;
        System.out.println("hasil luas segitiga :" + luasSegitiga);

    }
}