package ifelseifternary;

import java.util.Scanner;

public class IfSoru01 {
    /*
    Kullanıcıdan bir gün alın
    gün cuma ise muslümanlar için kutsal gun
    cumartesi ise yahudiler için kutsal gun
    pazar ise hırıstiyanlar için kutsal gun
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in)  ;
        System.out.println("Gun giriniz");
        String day = scan.next();
        //Stringlerde == kullanılmaz, equals kullanılır
        // Primiitiv lerde == kullanılır

        if(day.equalsIgnoreCase("Cuma")){ //ıgbnore: dikkate almamak equals u kullan büüyük küçük harfi dikkate alma
            System.out.println("Muslumanlar icin kutsal gun");
        }if (day.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }if(day.equalsIgnoreCase("Pazar")) {
            System.out.println("Hırıstiyanlar icin kutsal gun");
        }if(!day.equalsIgnoreCase("Cuma") && !day.equalsIgnoreCase("Cumartesi") && !day.equalsIgnoreCase("Pazar")) {
        System.out.println("Oyle bir kutsal gun yok");
        }
    }
}
