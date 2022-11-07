package day13whileloop;

import java.util.Scanner;

public class ForLoop04 {
    public static void main(String[] args) {
        /*
        satır sayısını kullanıcıdan alarak
        * * * * *
         * * * *
          * * *
           * *
            *
     şekklini oluşturunuz

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("satır sayısı giriniz");
        int s = scan.nextInt();

        for (int i = 0; i < s; i++) {
            for (int m = 0; m<i; m++){
                System.out.print(" ");
            }
            for (int k = 1; k <= s-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


