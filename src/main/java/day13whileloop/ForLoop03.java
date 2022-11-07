package day13whileloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {
/*
Forloop kullanacak satır sayısını kullanıcıdan alarak
aşagıdaki şekli oluşturun

         *
        * *
       * * *
      * * * *
     * * * * *
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("satır sayısı giriniz");
        int s = scan.nextInt();

        // satırlar arası seyahat için loop
        // yıldızlar için loop
        // boşluklar için loop

        for (int i = 1; i <= s; i++) {  //==>>>> Satırlar için
            // Spaceler için
            for (int k = s - 1; k >= i; k--) {
                System.out.print(" ");
            }
            //* lar için loop
            for (int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

