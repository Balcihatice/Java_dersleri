package day08ternary;

import java.util.Scanner;

public class NestedIfSoru3 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan password girmesini isteyin
        Girdigi password 5 e bölünüyorsa son rakamı kontrol et
        son rakam 0 ise ekrana "5 e bölünen çift sayı" yazdırın
        son rakam 0 değilse "5" e bölünen tek sayı" yazdırın

        Girdigi password 5 e bölünmüyorsa ekrana "tekrar deneyin" yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        int pwd = scan.nextInt();

        if(pwd%5==0) {
            if (pwd%10==0) {
                System.out.println("5'e bölünen cift sayı");
            } else {
                System.out.println("5'e bölünen tek sayı");
            }
        }else{
            System.out.println("Tekrar deneyin");
        }
    }
}
