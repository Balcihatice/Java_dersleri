package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayı alın
        sayı 3 basamaklı ise consola "uc basamaklı" yazdırın
        sayı 2 basamaklı ise consola "iki basamaklı yazdırın
        sayi 3 basamaklı veya 2 basamaklı degilse consola ikiside degil yazddırın
         */

       Scanner scan = new Scanner(System.in);
              System.out.println("Bir sayi giriniz");
            int a = scan.nextInt();

        if (a > 99 && a < 1000) {
            System.out.println("3 basamaklı");

            if (a > 9 && a < 100) {
                System.out.println("2 basamklı");

                if (!(a > 99 && a < 1000) && !(a > 9 && a < 100)) {
                    System.out.println("İkiside değil");





                    System.out.println("Bir sayi giriniz");
                    int x = scan.nextInt();

                    if (x == 10) {
                        System.out.println("Iki basamakli en kucuk sayi");
                    } else if (x== 100) {
                        System.out.println("Uc basamakli en kucuk sayi");
                    } else if (x == 1000) {
                        System.out.println("Dort basamakli en kucuk sayi");
                    } else {
                        System.out.println("Lutfen gecerli sayi giriniz...");
                    }
                }
            }
        }
    }}