package day12forloop;

import java.util.Scanner;

public class ForLoop06 {
    public static void main(String[] args) {

   /*
   Başlangıc ve bitiş degerini kullanıcıdan alın ve tum tamsayıların dgerlerini toplayıp ekraa yazdırın
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç degerini giriniz");
        int ilk = input.nextInt();
        System.out.println("Bitis degerini giriniz...");
        int son = input.nextInt();
        int toplam = 0;
        if (ilk > son) {
            System.out.println("Baslangıc degeri giris degerinden kucuk olmalı");
        } else {
            for (int i = ilk; i <= son; i++) {
                toplam = toplam + i;
            }
            System.out.println("Toplam : " + toplam);
        }
    }
}
