package day13whileloop;

import java.util.Scanner;

public class Forloop01 {
    public static void main(String[] args) {
        /*
        Kullnanıcıdan başlangıç degeri alın  başlangıçatan başlayıp bitiş harfinde biten
        tüm harfleri büyük harf olarak ekrana yazdırın
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç ve bitis hrflerini giriniz");
        char bas = input.next().toUpperCase().charAt(0);
        char bit = input.next().toUpperCase().charAt(0);

        if (!(bas >= 'A' && bas <= 'Z') || !(bit >= 'A' && bit <= 'Z')) {
            System.out.println("Lutfen harf giriniz");
        } else if (bas <= bit) {
            for (char i = bas; i <= bit; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = bas; i >= bit; i--) {
                System.out.print(i + " ");
            }
        }
    }
}