package day08ternary;

import java.util.Scanner;

public class NestedIfSoru01 {
    public static void main(String[] args) {
        /*
        Kuşşanıcıdan cinsiyetini girmesini isteyin
        eger erkekse yaşını kontrol edin 18 den kucukse "erkek cocuk" yazdırın
        yaşı 18 den büyükse "adam"yazdırın

        Kadın ise yaşını kontrol edin
        yaşı 18 den küçükse "kız cocuk"yazdırın
        yaşı 18 den buyukse "kadın" yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz...");
        String c = scan.next();
        System.out.println("Yasınızı giriniz");
        int y = scan.nextInt();

        if (c.equalsIgnoreCase("Erkek")) {
            if (y < 18) {
                System.out.println("Erkek cocuk");
            } else {
                System.out.println("Adam");
            }
        } else if (c.equalsIgnoreCase("Kadın")) {
            if (y < 18) {
                System.out.println("Kız cocuk");
            } else {
                System.out.println("Kadın");
            }
        } else {
            System.out.println("Bu cinsiyet tanımlı degil");
        }
    }
}