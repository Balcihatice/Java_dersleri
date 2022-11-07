package day08ternary;

import java.util.Scanner;

public class NestedIfSoru02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf isteyin
        girdiği küçük harf ise harfin "a" olup olmadıgını kontrol edin
        harf "a" ise ekrana "ilk küçük harf" yazdırın
        "a" degl ise ekrana "ilk küçük harf değil " yazdırın

        Girdigi büyük harf "T" ise harfin "Z" olup olmadıgını kontol edin
        harf "Z" ise ekrana "Son büyük harf" yazdırın
        "Z" degilse ekrana "Son buyuk harf degil" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char h = scan.next().charAt(0);

        if(h>='a' && h<='z'){
            if(h=='a'){
                System.out.println("Ilk kucuk harf");
            }else {
                System.out.println("Ilk kucuk harf degil");
            }
        } else if (h>='A' && h<='Z') {
            if(h=='Z'){
                System.out.println("Son buyuk harf");
            }else{
                System.out.println("Son buyuk harf degil");
            }
        }else{
            System.out.println("Lutfen harf giriniz...");
        }
    }
}