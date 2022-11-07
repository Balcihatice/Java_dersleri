package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan notunu alın ve aşagıdaki kurallara göre
        A,B,C,D yazdırın
        1-50 den az -D
        2-50(dahl) ile 60 arası -C
        3-60(dahil) 80 arası-D
        4- 80 dahil 100- dahil - A
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        int not = scan.nextInt();

        if(not<0){
            System.out.println("Sana not gir dedik...");
        }
        else if(not < 50) {
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");
        } else if (not < 80) {
            System.out.println("B");
        } else if(not<=100) {
            System.out.println("A");
        }else{
            System.out.println("Sana not gir dedik...");
        }
    }
}