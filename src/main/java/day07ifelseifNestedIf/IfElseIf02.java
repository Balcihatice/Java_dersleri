package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir ücgenin kenar uzunlugunu alın
        Uc kenar uzunlugu birbirine eşit ise "Eşkenar ucgen"
        sadece iki kenar eşitse "Ikız kenar ucgen
        Tum uzunluklar farklu ise "Ceşit kenar ucgen" yazdırın
         */
        Scanner scan = new Scanner(System.in)  ;
        System.out.println("UCgenin üc kenar uzunlugunu girin...");
        double k1 = scan.nextDouble();
        double k2 = scan.nextDouble();
        double k3 = scan.nextDouble();


        if(k1==k2 && k2==k3){
            System.out.println("Eskenar Ucgen");
        } else if (k1==k2 || k1==k3 || k2==k3) {
        System.out.println("Ikiz Kenar");
        }else {
            System.out.println("Cesit Kenar");

        }
    }
}
