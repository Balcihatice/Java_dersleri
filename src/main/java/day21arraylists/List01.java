package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
//Liste eleman eklemenin iki yolu vardir
        //    Listlerdeki degisiklikler kalicidiri

        List<String> ls = new ArrayList<>();
        ls.add("B");
        ls.add("M");
        ls.add("A");
        System.out.println("List: " + ls);//[B, M, K]
        ls.add(1, "K");

        System.out.println(ls);//[B, K, M, K]
        ls.add(0, "S");
        System.out.println(ls);//[S, B, K, M, K]

        ls.add("T");
        System.out.println(ls);// [S, B, K, M, A, T]
ls.add("M");
        //List`in icindeki eleman saysini bulma
        //Arrayde elemaan sayisindan bahsederken "Array`in lenght`i" deyiniz
//Listlerin elemaan sayisindan bahsederken "Lisst`in size`i" deyiniz
        System.out.println(ls.size());//6

        //Bir list bos mu
        System.out.println(ls.isEmpty());//false

//Bir List`ten` index kullanarak eleman silme
        ls.remove(2);
        System.out.println(ls);//[S, B, M, A, T]
        //    Listlerdeki degisiklikler kalicidiri Bundan sonra K yok
        //Index ile remove() metoodu kullanirsaniz ve ekrana yazdirirsaniz, Java sildigi elemaani ekrana yazar.

        //  System.out.println(ls.remove(3));//A sildigini yazdirdi


//Bir listten eleman ismi ile eleman silmek

        System.out.println(ls.remove("T"));//true Yukarida indexile silince silinen elemani yazar,kontrol edelim diye
        //Ama burda silinencek elemandan emin oldugumuzdan true return eder


        System.out.println(ls.remove("X"));//false
        System.out.println(ls);//[S, B, M, A]

        // Listte en sona M ekledik  ,Sil dedigimizde ilk M `yi siler
        ls.remove("M");
        System.out.println(ls);

//Bir listte istenen elemanin varolup olmadigini kontrol edelim
        System.out.println(ls.contains("A"));//true


    }
}
