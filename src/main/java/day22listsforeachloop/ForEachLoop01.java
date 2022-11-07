package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {
    public static void main(String[] args) {

        /*
        1) for-each loop for loopun gelismis halidir
        Yazmasi kolay
        Okumasi kolay
        Haata yapma ihtimali daha azdir.
         */

        // Integer List olusturun   elemanlari birer birer ayni satira aralarinda bosluk birakarak yazdirin

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);

        for (Integer w : list) {
            System.out.print(w + " ");
        }


        System.out.println();
        //foreachloop kullanarak lisst deki tum elemanlarin toplamini bulunuz
        int toplam = 0;
        for (Integer w : list) {
            toplam = toplam + w;
        }
        System.out.println(toplam);


        //ilk iki eleman haric diger elemanlari ekrana yazdiriniz
        //sublst(), ilk index dahil son index harictir, liast.size()=5 oldugundan 4.indexe kadar yazdi
        for (Integer w : list.subList(2, list.size())) {
            System.out.print(w + " ");//5 3 6
        }

        System.out.println();
        // Indexi 1 olan elemandan indexi 3 olan elemana kadar tum elemanlari yazdiriniz

        for (Integer w : list.subList(1, 4)) { //substring gibi ikinci index dahil olmuyor
            System.out.print(w + " ");
        }


        System.out.println();
        //list deki elemanlardan  tek sayi olanlari yazdirmayin

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");//2 4 6
            }
        }
        System.out.println();
// interview de sorarlaar

    //    2. yol
        for (Integer w :list ) {

            if (!(w % 2 == 0)){
                continue;  //ciftleri yazmaz
            }
            System.out.print(w+ " ");//2 4 6
        }


        System.out.println();
       //list deki 5 e kadar elemanlari 5 gorunceye kadar yazdirin

        for (Integer w :list ) {

            if (w == 5){
                break;  //ciftleri yazmaz
            }
            System.out.print(w+ " ");//2 4
        }




    }
}
