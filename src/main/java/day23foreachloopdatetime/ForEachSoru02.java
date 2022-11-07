package day23foreachloopdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru02 {

    static int no = 1000;

    public static void main(String[] args) {

       /*
      giris Yili + Ad ve soyadin ilk hafleri + Sira No :  olusturan bir ogrenci no kodu yazin
        */

        Scanner scan = new Scanner(System.in);

        String isim = "";
        int yil = 2020;
        List<String> isimler = new ArrayList<>();
        do {

            System.out.println("Ad soyad giriniz");
            isim = scan.nextLine();
            if (!isim.equalsIgnoreCase("X")) {
                isimler.add(isim);
            }

        } while (!isim.equalsIgnoreCase("X"));

        System.out.println(isimler);

        for (String w : isimler) {
            w.charAt(0); //Simdi space in indexini bulacagiz
            w.charAt(w.indexOf(" ") + 1); //soy isminin ilk harfi
            System.out.println(w + " id" + 20 + "" + w.charAt(0) + w.charAt(w.indexOf(" ") + 1) + no);
            no++;
        }


    }
}
