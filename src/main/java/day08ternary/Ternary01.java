package day08ternary;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int s = scan.nextInt();
        if(s>9)   {System.out.println("Rakam degil");}else {System.out.println("Rakam");}
        //condition   con.true ise çalışır                condition false ise çalışır

    // metod birşey return etti bunu memoy de bir yere koymalıyız
      String result = s>0 ? "Rakam degil" : "Rakam";
        System.out.println(result);  // bu ternary den geldi
        // bu şekilde her iki sonuçta aynı data typr(Strşng) ise memory de bunu koyacağımız
        //bir variable lazım
        // ama her ikisi aynı data değilde farklı data type üretiyorsa direk yazdır
        // örneği incele
        System.out.println(s>99 && s<1000 ? "3 basamakli" : s);
        //     =================>>>>>>>>>      String        int


       // ör:
        int d = 112;
        System.out.println((d>5)?("Inek"):("Koyun"));

        //Ekranda ne görürsün
        int y = 112;
        System.out.println((y<91) ? 9 : 11);


    }
}
