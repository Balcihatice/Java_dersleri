package ifelseifternary;

import java.util.Scanner;

public class IfElseSoru01 {
    public static void main(String[] args) {
        /*
Kullanıcıdan alacağı ürün miktarıı ve ürün birim fiyatını alın
Eger ürün miktarı 1000 den fazla ise kullanıcıya %10 indirim yapın ve
ödemesi gereken toplam parayı ekrana yazdırın
Diger durumlarda ödemesi gereken toplam parayı herhangi bir indrim yapmadan ekrana yazdırın
         */
        Scanner scan = new Scanner(System.in)  ;
        System.out.println("Urun miktarı giriniz...");
        int urunMiktari = scan.nextInt();
        System.out.println("Urun birim fiyatını giriniz");
        double birimFiyat = scan.nextInt();

        double odenecekTutar = urunMiktari*birimFiyat;
        double indirimliFiyat = odenecekTutar*0.9;

        if(urunMiktari>1000){
            System.out.println("Odenecek Tutar : " + indirimliFiyat);
        }else{
            System.out.println(odenecekTutar);
        }
    }
}
