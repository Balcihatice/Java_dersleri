package day10stringmethod;

public class String01 {
    public static void main(String[] args) {

        // 4. Method: String ile çalışır. char ile çalışmaz
        String s1 = "Test al kendini gör";
        System.out.println(s1.endsWith("r")); // true

        System.out.println(s1.endsWith("gör")); //true

        System.out.println(s1.endsWith(""));

    // 5)

        System.out.println("Ali".equals("Ali"));     //true
        System.out.println("Ali".equals("ALI"));     // false
        System.out.println("Ali"=="Ali"); // true

//        == 1) degerleri kontol eder
//           2) adresleri kontrol eder kullanıcıdan gelince adrese de bakar false verir
// 6) .equalsIgnoreCase:
        System.out.println("Ali".equalsIgnoreCase("ALI"));// true
        System.out.println("Veli".equalsIgnoreCase("Veli"));

/* 7.) .indexOf(); metodu indexi sorulan çarın String içindeki
        ilk  gorunumunun indexini return eder.
        indexof metodunda hem char hende strşng ile çalışır
        indexof metodunda birden fazla karakterin indexi sorulursa
        ilk karakterin indexi return eder
       */
        // String s1 = "Test al kendini gör";
        System.out.println(s1.indexOf('i')); //4
        System.out.println('T'); // 0 return eder
        System.out.println(' ');// 5
        System.out.println("al");

        System.out.println(s1.indexOf('x')); // indexof metodu olmayan karakterler için
        // -1 return eder

        System.out.println(s1.indexOf("")); //0 ilk hiçbirşeyi verir
 // 8.Method
         String s2 = "Cabuk ogrenilen cabuk unutulur";
         System.out.println(s2.indexOf('a',6)); //17--- 6. karakterden sonra ilk a karakterini araştırır

        s2.indexOf('r',8) ; // 8
        // ==== 8. indexten sonra ilk r yi bulur,baştan sayar kacinci 'index 'se return eder

        System.out.println(s2.indexOf("buk",5)); //18

//9.Method :isEmpty() metodundan true alıyorsak o stringin içinde hiç bir karakter yok demektir
        //yani o stringin length i sıfır demektir.length sıfırsa isEmpty true verir

        String s3 = "Tekrar et tekrar unutma";
        System.out.println(s3.isEmpty()); // s3 stringi boş mu? false: boş degil
        System.out.println("".isEmpty()); // "" bu string boşmu true

// 10.Method:indexi sorulan karakterin son gorunumunun indexini
        // return eder
        System.out.println(s3.lastIndexOf('e')) ; // e nin son indexi  11 return eder
        System.out.println(s3.lastIndexOf("rar")); // 13 return eder
        System.out.println(s3.lastIndexOf('r',16));// ilk 16 karakteri sayar bunu içindeki son 'r' yi return eder
        System.out.println(s3.lastIndexOf('k',14)); //12 verir

// 11.Method: length metodu bir string deki karakterlerin sayısını verir
        System.out.println(s3.length()); //23

// 12.Metodu: Bir stringi degiştirme de kullanılır
        System.out.println(s3.replace('e','E'));        // e ler E olur
        System.out.println(s3.replace('x','M')); // hiç bir şey degiştirmez
        // aynı stringi return eder

        System.out.println(s3.replace("krar","miz"));// temiz et temiz unutma
        System.out.println(s3.replace("a","")); // tum "a" ları siler, tekrr et diye devam eder
        // hiçbirşey charda yok tur string de vardır.
        System.out.println(s3.replace(" ","")); //boşlukları siler
        System.out.println(s3.replace("","|")); //|T|e|k|r|a|r....


// 13: regex()
       String s4 = "Code1 yazarak2 ogrenilir3";
       /*  enterviev de soruldu************************************************************
       Regular Expression (regex):  Belli türdeki karakterleri seçebilmemizi sağlar
    1) \\d ==>> tum rakamlar demektir
       \\D : tum rakam dışı karakterler.
    2) \\w(world)==>> A->Z  , a->z, 0-9 hepsi var
       \\W    A->Z  , a->z, 0-9 dışındaki herşey
    3) \\s(space)
       \\S space dışındaki herşey ** olur
       */
        System.out.println(s4.replaceAll("\\d","*"));
        System.out.println(s4.replaceAll("\\D","*"));
        System.out.println(s4.replaceAll("\\w","*")); // hepsi****
        System.out.println(s4.replaceAll("\\s","*")); // tum buşluklar *
        System.out.println(s4.replaceAll("\\S","*"));



//  14) startWith:

        System.out.println(s4.startsWith("C")); // true
        System.out.println(s4.startsWith("c")); //false
        System.out.println(s4.startsWith("Code")); // true


// s4 stringinin 4. karakteri i(index3) mi?
        System.out.println(s4.startsWith("e",3)); // true

    


    }
}
