package day09switchstringmethod;

public class String01 {
    public static void main(String[] args) {

        //    1.Method:
        String s1 = "Study Hard Stay Humble";
        System.out.println(s1.charAt(0)); //S

        //7. harfi yazdır
        System.out.println(s1.charAt(6));
        //son harfi yazdır
        System.out.println(s1.charAt(s1.length()-1));//character sayısı-1 yaptık
//=======>>>>> degişime göre çalışan kodlara dinamik kod denir.

        // ortadaki karakteri ekrana yazdırınız
        if (s1.length() % 2 != 0) {
            System.out.println(s1.charAt((s1.length() - 1) / 2));// boşluga denk geldi
        } else {System.out.println("orta character yok");
        }
    //    System.out.println(s1.charAt(38));//olmayan index kullanınca hata verir hatanın satırını da söyler
    //range : aralık
        // çalıştıktan sonra anladıgı hatalara : run time errror(çalışma zamanı hatası)
        // kod yazarken kırmızı çizgi alırsak : compile time error:
        //Run time error oluştugunda sonraki kodlar çalıştırılmaz

    //    kod çalıştırma:Execution


//    2. Method:
      String s2 = "Ogreten ogrenir";
        System.out.println(s2.concat(" tamam mı?"));  // concat iki stringi birleştirir.
//3. Method:
        String s3 = "Java ogren zengin ol";
        System.out.println(s3.contains("x"));// s3 stringi içeriyor mu s harfini.Sonuç true ya da false
        // contains metodu boolean (true -false) return eder
        System.out.println(s3.contains("ogren"));
        System.out.println(s3.contains(""));//true verir.Bu hiçbirşeydir.Java yazısında j ile a arasında hiçbirşey vardır
        // space (boşluk) hiçbirşey değildir. Java space i character kabul eder.

        System.out.println(s3.contains(" "));// true
        System.out.println(s3.contains("Zengin"));// false
        System.out.println(s3.contains("."));//false
   //



    }
}
