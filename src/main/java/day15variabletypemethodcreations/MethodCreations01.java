package day15variabletypemethodcreations;

public class MethodCreations01 {

    public static void main(String[] args) {// main method static oldugundan içindeki herşey statik olmalı.
        // aşagıdaki metot da statik olmalı

 /*
 Metod oluştururken aynı metod isimlerini kullanabilir,ama parametreler farklı olmalıdır
 Parametreleri farklı yapmamın 3 yöntemi vardır
 1) Parametre sayılarını farklı yapabiliriz            (a,b  )    (a,b,c)
  Parametrelerin isimlerini degiştirmek işe yaramaz  (x,y)gibi. yine iki sayı var java için a veya b veya x veya y farketmez.

 2) Parametrelerin data type larını degiştirebiliriz.

 public static void carpma(int a, double b)
 public static void carpma(double a, int b)

 3) data typeları farklı ise parametrelerin yerlerini degiştirebiliriz
  */
        toplama(3, 5);
        toplama(6.2, 1.4);
        carpma(2, 5.6);// metodu çağırırken kullanılan sayılara "argüment" denir.
        carpma(3.4, 5.6, 6.7);
        carpma(4,5,6);
   // java bu işlemleri yapmak için aşagıdaki metodlara bakar hangisi uygun ise ve daha cabuk işlem yapacaksa onu secer.
    }
    public static void toplama(double a, double b) { // metod parantezin () içine metodun çalışması için lazım olan şeyleri koyarız
        System.out.println(a + b);// verilen sayıyın print in içine alınmasına  "pass" denir
    }

    public static void carpma(double a, double b) {// metod parantezinin  içindeki() deegerlere parametre denir
        // bunların işi degerleri geçirmek (depolamak degil) normal variablelar depolar
        System.out.println("carpma : " + a * b);
    }
    public static void carpma(int a, double b) {// metod parantezinin  içindeki() deegerlere parametre denir
        // bunların işi degerleri geçirmek (depolamak degil) normal variablelar depolar
        System.out.println("carpma : " + a * b);
    }
    public static void carpma(int b,int a) {// metod parantezinin  içindeki() deegerlere parametre denir
        // bunların işi degerleri geçirmek (depolamak degil) normal variablelar depolar
        System.out.println("carpma : " + a * b);
    }
    //üc double ı carpan bir carpma metodu oluşturun ve bu metodu main metod içinden çağırın

    public static void carpma(double a, double b, double c) {// metod oluşturuken aynı ismi kullanabiliriz,ama
                                                             // parametreler mutlaka farklı olmalı
        System.out.println("Carpma:" + a * b * c);
    }





}

