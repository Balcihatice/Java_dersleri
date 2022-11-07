package day04scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //kullanıcıdan dikdörtgenin uzun ve kısa kenarını alıp
        // alan ve çevresini ekrana yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Kısa kenarı giriniz");
        double kisa = scan.nextDouble();
        System.out.println("Uzun kenarı giriniz");
        double uzun = scan.nextDouble();
        System.out.println("Alan: " + kisa*uzun);
        System.out.println("Cevre : " + 2*(kisa+uzun));
    scan.close(); // scan i kullandık ve geri kütüphaneye verdik
    }
}
