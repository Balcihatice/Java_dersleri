package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf04 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir yıl alın eger yıl 1000 e bulunursa
        ekrana "Milenyum" yazdırın
        Eger yıl 100 e buluuyorsa "yüzyıl "yazdırın
        eger yıl 10 a bulunuyorsa ekrana "onyıl "yazdırın
         */


        //NOT: normalde ifelse kücükten buyuge gidirlir bu soru da buyukten kucuge gittik
        //cünkü mantıgı farklı 2000 aynı zamanda onluktur ama önce milenyum olup olmadıgına baktık
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz...");
        int yıl = scan.nextInt();

        if(yıl<=0){
            System.out.println("Negatif veya sıfır yıl kabul edilmez...");
        } else if(yıl % 1000 == 0) {
            System.out.println("Milenyum");
        } else if (yıl%100==0) {
            System.out.println("Yuzyil");
        } else if (yıl%10==0) {
            System.out.println("Onyil");
        }else {
            System.out.println("Hicbiri");
        }
    }
}