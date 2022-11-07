package day08ternary;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ücgenin uc kenar uzunlugunu alın
        eger iki kenar eşitse "ikizkenar " yazdırın
        diger durumlarda ekrana "ikizkenar degil" yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();

       String result = k1==k2 || k2==k3 || k1==k3 ? "Ikız kenar ucgen" : "Ikızkenar degil";
        System.out.println(result);
    }
}
