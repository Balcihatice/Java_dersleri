package day08ternary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        /*
Kullanıcıdan bir tam sayı alın
Eger tamsayı 0 dan kucuk ise ekrana "Negatif"yazdırın
diger durumlarda ekrana "Negatif degil" yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int s = scan.nextInt();

        String result = s<0 ? "Negatif" : "Negatif degil";
        System.out.println(result);


    }
}
