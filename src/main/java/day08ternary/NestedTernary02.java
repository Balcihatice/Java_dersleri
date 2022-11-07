package day08ternary;

import java.util.Scanner;

public class NestedTernary02 {
    public static void main(String[] args) {
        /*
        Artık yıl:(ep Year)

        100 e bölünen yıllardan 400 e bölünen artık yıldır
        100 e bölünmeyenden 4 e bölünenler artık yıldır

        Kullanıcıdan alınan yılın artık yıl olup olmadıgını bulun(interviev)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl giriniz");
        int year = scan.nextInt();
       String result = year % 100==0 ? year%400==0 ? "Lep year": "not lep degil" : year%4==0 ? "Artık yıl" : "Artık yıl degil";
        System.out.println(result);

    }
}
