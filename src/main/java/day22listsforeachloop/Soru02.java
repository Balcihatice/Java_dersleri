package day22listsforeachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {

        /*
        Kullanicidan tam isim alin .
        Isim harflerini bir liste ekleyiniz
        Harfleri alfaabetik sirada buyuk harfler olarak yazin
        Harfleri alfaabetik siranin tersinde buyuk harfler olarak yazin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Tam isminizi giriniz");

        String name = scan.nextLine().toUpperCase().replace(" ", "");
//Ismin harflerini var olan sirada yazdirma
        List<Character> harfler = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            harfler.add(name.charAt(i));
        }
        System.out.println(harfler);

        //Alfabetik siralama
        Collections.sort(harfler);
        System.out.println(harfler);



//Alfabetik siralamanin tersi
        //1. yol
        List<Character> tersten = new ArrayList<>();
        for (int i = harfler.size()-1 ; i>=0 ; i--) {
            tersten.add(harfler.get(i));
        }
        System.out.println(tersten);


     // 2. yol
     Collections.reverse(harfler);
        System.out.println(harfler);






    }
}
