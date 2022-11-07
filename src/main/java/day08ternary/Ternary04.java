package day08ternary;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
 /*
Kullanıcıdan alacağı ürün miktarıı ve ürün birim fiyatını alın

Eger ürün miktarı 1000 den fazla ise kullanıcıya %10 indirim yapın ve
ödemesi gereken toplam parayı ekrana yazdırın

Diger durumlarda ödemesi gereken toplam parayı herhangi bir indrim yapmadan ekrana yazdırın
         */
        Scanner scan = new Scanner(System.in)  ;
        System.out.println("Urun miktarı giriniz...");
        int miktar = scan.nextInt();
        System.out.println("Urün birim fiyatını giriniz");
        double fiyat = scan.nextDouble();

        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;
        System.out.println(result);
    }
}
