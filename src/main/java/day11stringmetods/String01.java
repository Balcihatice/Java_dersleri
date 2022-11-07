package day11stringmetods;

public class String01 {
    public static void main(String[] args) {
        // 15.

        String s1 = "Java OOP language oldugu icin populardir";
        System.out.println(s1.substring(3));
//OOP languagedir yazdırın
        System.out.println(s1.substring(5));
        System.out.println(s1);// tamamını alır
        System.out.println(s1.substring(s1.length() - 1)); //data degişince kod hala çalışmalıdır
        //kod değiştirlimemelidir.

        System.out.println(s1.substring(9,17));
        //        9. indexten başla(9 dahil),17 ye kadar (17 hariç).

        System.out.println( s1.substring(0,1)); // sıfırncı indexi verir.
        //Stringdeki ilk harfi charat(0) da verir.
        //substring(0,1)     ==  charat(0)   eşit mı? hayır return ettikleri data type farklıdır.
        //String return eder,   char return eder

        System.out.println(s1.substring(5,5));// indexler eşit ise hiçbirşey alırız
        // java soldan saga gittiginden 5 olanı al ve alma dimiş oluyoruz.

       //s1.substring(5,2);//substring metodunda başlangıc indexi bitiş indexinden buyuk olamaz
        //buyuk olursa kod run time error alırız.

//16: trim() :Baştaki ve sondaki space leri siler.   kırpmak kesmek rutuşlamak.

        String s2 = "     Java ogrenen diger dilleri cabucak ogrenir       ";
        System.out.println("Trim kullanmadan önce: " + s2);
        System.out.println("Trim kullanmadan sonra: " + s2.trim());






    }
}
