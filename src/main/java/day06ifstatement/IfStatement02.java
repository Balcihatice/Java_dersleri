package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayi alınız bu sayı çift sayı ise konsola
        çift,
        tek sayı ise konsola tek yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0){
            System.out.println("Sayı Çift Sayıdır.");
        }
        if(sayi % 2 != 0){
            System.out.println("Sayı tek sayıdır...");
        }
    }
}
