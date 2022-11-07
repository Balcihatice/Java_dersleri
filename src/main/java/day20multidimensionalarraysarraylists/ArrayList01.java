package day20multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //Arrayler icin data type ve lenght ini soylemek zorundayiz.uzunlugu en basta belirlenmelidir.
        //arrayler Array.toString ile yazdirilir
        //Array`lere primitive ve refeance ler konur

        //ArraayList`de uzunluk belirlemeye gerek yok.Icinde string metodlar kullanilir
        //sout(List) seklinde kolayca yazdirilir
        //Listler nun primitive kabul eder. Primitive yerine wrapper Class`lari kullaniriz(String,Integer,Double,....)

        //ArrayList olusturma:
        //1.Yol:
     //   ArrayList<Integer> list1 = new ArrayList<Integer>();

        //2.Yol
     //   ArrayList<Integer> list2 = new ArrayList<>();

        //3.Yol : Recommended (tavsiye edilen)
        List<Integer> list3 = new ArrayList<>();
        System.out.println(list3);//[]

     //List`emeleman ekleme
     list3.add(12);
        System.out.println(list3);//[12]
        list3.add(13);
        System.out.println(list3);//[12, 13]

    }
}
