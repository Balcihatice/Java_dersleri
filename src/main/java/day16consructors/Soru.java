package day16consructors;

import java.util.Scanner;

public class Soru {
    /*
     Kullanıcıya bir sayi girmesini söyleyin
     kullanıcı sıfır girdiginde ekrana o ana kadar girmiş oldugu tum sayıların toplamını yazdırn
     ör: 5.4.7.0 ise 5+4+7=16
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int num =0;
        do{
            System.out.println("Bir sayı giriniz");
            i = scan.nextInt();
            num = num + i;
        }while(!(i==0));
        System.out.println("Girilen sayıların toplamı: " + num);
    }
}
