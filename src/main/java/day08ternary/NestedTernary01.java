package day08ternary;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayı alın
        sayı 3 basamaklı ise consola "uc basamaklı" yazdırın
        sayı 3 basamaklı degilse çift olup olmadıgını kontrol edin
        çift ise uc basamklı cift sayı
        Çift sayi degilse "3 basmaklı olmayan tek sayı "yazdır
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int a = scan.nextInt();
       String result = a>99 && a<1000 ? "3Basamakli" : a%2==0 ? "3 basamaklı olmayan cift sayi" : "3 basamakli olmayan tek sayi";
        System.out.println(result);
    }
}
