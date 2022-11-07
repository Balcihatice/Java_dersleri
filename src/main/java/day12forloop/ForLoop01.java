package day12forloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

/*
Kullanıcıdan başlangıç ve bitiş degeri alın
Başlangıc degerinden başlayıp bitiş degerinde biten tüm tamsayıları ekrana yazddırın
Ör: Kullanıcı 10 ve 15 verirse====>>>> 10 11 12 13 14 15
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Başlangıç degerini giriniz");

        int bas = input.nextInt();

        System.out.println("Bitis degerini giriniz");
        int bit = input.nextInt();


        if (bas > bit) {
            System.out.println("Baslangıc degeri giris degerinden kucuk olmalı");

        } else {

            for (int i = bas; i <= bit; i++) {
                System.out.print(i + " ");
            }
        }








    }
}
