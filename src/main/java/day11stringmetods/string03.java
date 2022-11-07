package day11stringmetods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class string03 {
    public static void main(String[] args) {
        /*
        1)Kullanıcıdan ad soyad ve 11 haneli tc numarası alın
        2)Kullanıcı hatayla ad ve soayd başına space koyarsa silin
        3)ad ve soyadın ilk harfleri buyuk diğerlri kucuk olmalıdır
        4)Kimlik no son 4 rakamı hariş hepsi * yapılmalıdır
        ör: Ali Can *******1234;
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adınızı giriniz...");
        String ad = input.nextLine();
        System.out.println("Lutfen soyadınızı Giriniz...");
        String soyAd = input.nextLine();
        System.out.println("Lutfen tc giriniz...");
        String tc = input.nextLine();

        ad = ad.trim();// memory deki name e yeni boşluksuz halidi atadık
        soyAd = soyAd.trim();

//  3)ad ve soyadın ilk harfleri buyuk diğerlri kucuk olmalıdır

        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyAd = soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1).toLowerCase();
//                soyismin ilk harfi buyuk oldu        soyismin diğer harfi kucuk oldu  bunu ayAd a gönderdik

//        4)Kimlik no son 4 rakamı hariş hepsi * yapılmalıdır

 //       tc = "*******" + tc.substring(tc.length() - 4);

        System.out.println("ad = " + ad);
        System.out.println("soyAd = " + soyAd);
        System.out.println("tc = " + tc);


    }
}
