package day06ifstatement;

import java.util.Scanner;

public class IfStatement_03 {
    public static void main(String[] args) {


     /*
        Kullanıcıdan bir karakter alın
        bu character büyük harf ise "Büyük harf " yazdırın
        bu character küçük harf ise "Küçük harf " yazdırın
        bu character harf degilse ise "Harf degil " yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir charcter giriniz");
        char ch = scan.next().charAt(0);

        if(ch>='A' && ch <= 'Z'){
            System.out.println("Buyuk Harf");
        }
        if(ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");
        }
        if(!(ch>='A' && ch <= 'Z') && !(ch>='a' && ch<='z')){ // arası ve mi veya mı .Çay kahve örneğini hatırla
            System.out.println("Harf Degil");
        }
        /*logical operator(mantık işlemleri)
        1) And: sembolü & veya && dır
             true && true=true    birinin varlıgı yetmez ikiside olmalı
             true && false=false
             false && tue=false  birinci false ise sonucu kesin false o yuzden çift &&kullanmak daha iyidir
             false && false=false  tek & yavaş çalışır && hızlı çalışır ilk durum false ise ikinciye bakmaz
        2) Or işlemi: Sembolu || dur
             true % true=true
             true % false=true
             false % true=true
             false % false=false
        3) not işlemi: Sembolu ! dur
             !true = false
    */





    }
}