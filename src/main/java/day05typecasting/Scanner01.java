package day05typecasting;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        kenar uzunlukları kullanıcıdan alınan ücgenin çevresini
        veren kod yazın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("ücgenin kenar uzunluklarını girini");
        byte k1 = scan.nextByte();
        byte k2 = scan.nextByte();
        byte k3 = scan.nextByte();
        int cevre = k1+ k2+k3; //byten sınırını gecebilir diye int aldık
        System.out.println("çevre : " + cevre);
        //pzrantez içi mümkün oldugu kadar basit tut.





    }
}
