package day12forloop;

import java.util.Scanner;

public class ForLoop08 {
    public static void main(String[] args) {

    /*
    Kullanıcıdan başlangıc ve bitiş degeri alın
    başlangıc ve bitiş nasıl olursa olsun başlangıç degerinden bitiş degerine kadar tum sayıların
    çarpımını yazdıran program yazınız
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç degerini giriniz");
        int bas = input.nextInt();
        System.out.println("Bitis degerini giriniz");
        int bit = input.nextInt();
        int carpim = 1;

        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                carpim = carpim * i;
            }
        } else {
            for (int i = bas; i >= bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.println("carpim = " + carpim);


    }
}
