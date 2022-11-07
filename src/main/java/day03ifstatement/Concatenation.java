package day03ifstatement;

public class Concatenation {
    public static void main(String[] args) {
        /* java da matematiksel işlem yaparken sonuc buyuk data tipine
        göre verilir
        in / int = int
        ljava yuvarlama işlemi yapmaz
        ör: 47/10=4.7 dir. ama java da  4 yazar

        */
 int d = 12;
 double e =4;
 float f = 4f;
 System.out.println(d/e); //3.0
        System.out.println(d + e); //16.0
        System.out.println(e/d); //virgülden sonra 16 rakam var
        System.out.println(f/d);// , sonra 7 rakam var

   //  Modulus: 2 ondalık olmayan sayı birbirine bölündüğünde kalanı verir
    // java modulus sembolü : % dir
        System.out.println(13%5);
        System.out.println(245%3);
 // çift sayı : even // 2 ye bölününce o kalan verir
 // tek sayı : Odd  >> 2 ye bölündüğünde 1 kalanı verir
        System.out.println(12432567%2); // kalan 1>>sayı tek
 // Concatenation: Sonucu her zaman String dir
String s1 = "Java";
String s2 = "Kolaydır";
        System.out.println(s1+ " " + s2);
 int g = 2;
 int h =3;
 String i = "Java";
        System.out.println(i + g + h);
        System.out.println(i + (g + h)); // pazantez işlem önceliği tanır ve () içi int oldugundaniçerde toplama yapar
        // sonra  concatenation yapar.
        System.out.println(g + h + i); //5java >> sonuc String dir
        System.out.println((g*h)   +""+     (h-g) + i + (g-h)); // 61java-1
                       //    6    hiçbirşey   1   java
                           //     " " -->> Bu boşluktur
    }
}
