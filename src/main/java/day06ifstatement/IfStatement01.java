package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
       /*
       If it rains      I will cansel picnic
          true olursa    çalışır
          false          çalışmaz
          ilk ()          {}
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı giriniz...");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if(a>b){ //parantez içi: condition(şart)
            System.out.println("İlk sayı büyük");//if body
        }
        if(a<b){
            System.out.println("İkinci sayı buyuk");
        }
        if(a==b){
            System.out.println("İki sayı eşit");
        }
    }
}
