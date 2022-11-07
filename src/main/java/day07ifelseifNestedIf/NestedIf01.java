package day07ifelseifNestedIf;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /* Zigon sehpa gibi, iç içe girmiş if
        nested if: if içinde if,
        Kullanıcıdan bir sayı alın
        eger sayi pozitif ise ondan buyuk olup olmadıgını kontroö edin .
        eger 10 dan buyuk ise buyuksun
        eger 10 dan kücük ise normalsin

        eger sayi pozitif ise -10 buyuk olup olmadıgını kontroö edin .
        eger -10 dan buyuk ise negatifsin
        eger -10 dan kücük ise çok negatifsin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int s = scan.nextInt();    //outer if
        if(s>0){
            if(s>10){      //inner if
                System.out.println("Buyuksun");
            }else {
                System.out.println("Normalsin");}
        }
      else{
          if(s>-10){
              System.out.println("Negatifsin");
          }else{
              System.out.println("Cok negatifsin");
          }
      }

    }
}
