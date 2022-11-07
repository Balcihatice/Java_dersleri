package arrays01;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        //example:

        int sayi[] = new int[4];
        System.out.println(Arrays.toString(sayi));  //bu sekilde yazdirirsak memoryde 4 tane sfir degeri olusur
        sayi[0] = 8;
        sayi[1] = 5;
        sayi[2] = 6;
        sayi[3] = 9;
        System.out.println(sayi.length);
//Example:String bir arrays olusturun
        //Arrays ler non primitivleri depolayamazlar (String ...)
        //    NOT: ARRAYS PRIMITIVE VE REFERANCE DEPOLAR(adres). Biz string olusturdugumuzda java referance gider ve onun degerini bulur getirir
        String isim[] = new String[3];
        System.out.println(Arrays.toString(isim));//null verir.Cunku henuz bir deger atamasi yapmadik

        isim[0] = "Ayse";
        isim[1] = "Ali";
        isim[2] = "Kemal";
        System.out.println(Arrays.toString(isim));


  //Bir arrayde spesifik bir elemani cagirma

        System.out.println(isim[1]);//2. eleman
        System.out.println(isim[0]);//ilk eleman

 //isim arrayindeki elemanlari alt alta yazdirin

        for (int j = 0; j < isim.length ; j++) {
            System.out.println(isim[j]);
        }
        //array deki elemanlari birer birer cagirmak icin for loop la yapiliyor
        //  Example : sayi arrayindeki elemaanlari ayni satira onlerine * koyarak tersten yazdiriniz
        for (int i = sayi.length-1; i >= 0; i--) {
            System.out.print("*" + sayi[i]);
        }
            System.out.println();
// sayi arrayinde indexi cift olanlari yazdiriniz
         for (int j = 0 ; j < sayi.length; j++) {
                if (j%2==0){
                    System.out.println(sayi[j]);
                }
            }

//arraydeki elemaanlari kucukten buyuge siralamak(ascending order) siralamak

        Arrays.sort(sayi);//kucukten buyuge siralar.
        System.out.println(Arrays.toString(sayi)); //[5, 6, 8, 9]

        Arrays.sort(isim); //Stringleri alfabetik siraya sokar.
        System.out.println(Arrays.toString(isim));//[Ali, Ayse, Kemal]

// NOT: java da kucukten buyuge siraklama ve alfabetik siralama yerine "Natural Order" Kullanilir.





        }
    }

