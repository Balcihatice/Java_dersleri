package day06ifstatement;

import java.util.Scanner;

public class Swap01 {
    public static void main(String[] args) {
        //Swap: yer degiştirme,
 /*========>>>>>>>>>>>>>     bu intervev sorusudur
                // a variableı 12,
        b variable ı 25 olsun
            öyle bir kod yazınız ki a25,b 12 olsun
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı giriniz...");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("============");

        //1. yol==>> 3. bir variable kullandık

        double temp=0;
        temp=a; // temp=12, a=12, b=25 java degerin kendisini degil kopyasını gönderiryor
        a=b;    // temp=12, a=25, b=25 java da yeni gelen deger eski degeri öldürür
        b=temp; // temp=12, a=25, b=12 yeni deger gelmeden eski deger ölmez

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("=========");
// 2. Yol: ucuncu bir variable kullanmadan yap
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);






    }
}
