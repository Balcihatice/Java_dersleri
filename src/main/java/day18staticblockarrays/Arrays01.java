package day18staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

    int x = 12;
        /*
         1) Arrayler birden fazla degeri depolamak icin kullanilabilir
         2) arraylere konulan degerlerin data type lari ayni olmalidir
         3) array olustururken kac tane eleman koyacagimixi soylememiz lazim
         4) Array`lere sadece a) primitive  ve  b) reference`lar depolayabilir.
         */

    public static void main(String[] args) {
        int a[] = new int[4];
        System.out.println(Arrays.toString(a));// deger atamsi yapmadigimizdan default deger return eder [0, 0, 0, 0]
        a[0] = 8;
        a[1] = 23;
        a[2] = 15;
        a[3] = 8;
        System.out.println(Arrays.toString(a));//[8, 23, 15, 8]

//arraylerde kac eleman oldugunu bulmak
        //Stringlerde kullandigimiz lenght() dir, Aarraylerde kullandigimiz lenght.
        System.out.println(a.length); //4

        //String array olusturunuz,
        String b[] = new String[3];
        System.out.println(Arrays.toString(b)); //[null, null, null, null]
          b[0] = "Ali";
        System.out.println(Arrays.toString(b));//[Ali, null, null, null]
        b[1] = "Ayse";
        System.out.println(Arrays.toString(b));
        b[2] = "Kemal";
        System.out.println(Arrays.toString(b));

//Bir array`den spesifik bir elemani yazdirma

        System.out.println(b[2]); //Kemal

        System.out.println(b[0]);//Ali
        System.out.println(b[1]); //Ayse

      // b array`indeki elemanlari alt alta yazdiriniz
        // Arraydeki elemanlar birer birer ekrana yazdirmaak icin loop kullanilir
        for (int i = 0; i <b.length ; i++) {  // index sifirdan baslar
            System.out.println(b[i]);
        }

      // a array`indeki elemanlari ayni satira onlerine "*" koyarak tersten yazdiriniz

        for (int i = a.length-1; i >= 0; i--) {
            System.out.print("*"+ a[i]);  //*8*15*23*8
        }
        System.out.println();

       // a array`inde indexi cift olan elemanlari yazdiriniz

        for (int i = 0; i < a.length; i++) {//[8, 23, 15, 8]
            if (i%2==0){
                System.out.println(a[i]);  // 8, 15
            }
        }
        // Arraydeki elemanlari kucukten buyuge siralamak(ascending order) siralamak

        // a array`indeki elemanlari kucukten buyuge siralayiniz
      Arrays.sort(a); //{8,8,15,23}

        System.out.println(Arrays.toString(a));//[8, 8, 15, 23]

// sort() metodunu b arrayinde kullaniniz
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));//[Ali, Ayse, Kemal]
        //Stringlerde sort metodu alfabetik siraalama yapar.
        //Java da kucukten buyuge siralama ve alfabetik siralamaya "Natural Order" kullanilir.







    }
}
