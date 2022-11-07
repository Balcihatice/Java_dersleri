package day05typecasting;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdigi 4 basamaklı sayının ilk ve son rakamının toplamını e
        ekrana yazdıran program
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int s = scan.nextInt();
        // bir sayının birler basamağı lazım olursa "%10"
      int sonRakam = s%10;
      //dört basmaklı bir sayının ilk rakamını almak için 1000 e böl,
        // beş basmaklı bir sayının ilk rakamını almak için 10000 e böl,
      int ilkRakam = s/1000;
        System.out.println("ilkRakam ve sonRakam = " + (ilkRakam + sonRakam));



    }
}
