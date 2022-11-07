package day12forloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {

   /*
   Kullanıcıdan bir sayı alın .Bu sayıdan kucuk olan
   tum pozitif sayıları aynı satırda aralarında boşluk bırakarak yazın

    */

        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç degerini giriniz");
        int s = input.nextInt();

        if (s < 1) {
            System.out.println("Pozitif sayı giriniz...");
        } else {
            for (int i = s; i >= 1; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
