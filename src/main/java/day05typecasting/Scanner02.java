package day05typecasting;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
        kullanıcıdan alınan şekilden
            a
           a a
          a a a yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir char alın");
        char ch = scan.next().charAt(0);
        System.out.println("  " + ch + "  ");
        System.out.println(" "+ ch +" "+ ch +"");
        System.out.println(ch +" "+ch+" "+ ch);

    }
}
