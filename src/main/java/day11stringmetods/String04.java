package day11stringmetods;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        /*
       1) Kullanıcıdan bir String alın
       2) tum rakamları "*" ya çevirin
       3) baş ve sondaki tum space leri silin
       4) Aralarındaki tum spaceleri ! işaretine cevirin
       5) a ve z harflerini buyk harf yapın,diger tum harfler kucuk harfyapın
       6)  en bas'a    "("ve en sona") "ekleyin
         */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen Stringi giriniz...");
        String s = input.nextLine();
  //2) tum rakamları "a" ya çevirin

        s = s.replaceAll("\\d", "*");
 //3) baş ve sondaki tum space leri silin
        s = s.trim();

// 4) Aralarındaki tum spaceleri ! işaretine cevirin
        s = s.replaceAll(" ", "!");

// 5) a ve z harflerini buyk harf yapın,diger tum harfler kucuk harfyapın
        s = s.toLowerCase();
        s = s.replace("a","A");
        s = s.replace("z","Z");

// 6)  en bas "a"   ("    ve en sona   ")"    ekleyin
        s = "(" + s + ")"; // concat yaptık.söylede yapabiliriz.   s = "(".concat(s).concat(")");

        System.out.println(s);




    }
}
