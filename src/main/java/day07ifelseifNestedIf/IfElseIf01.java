package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf01 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir tamsayı alın
        Eğer tamsayı 0 dan küçük ise "negatif"
        0 ise nötr yazsın
        o dan buyuk ise pozitif yazsın

         */
        Scanner scan = new Scanner(System.in)  ;
        System.out.println("Sayi giriniz");
        double d = scan.nextDouble();
        if(d<0){
            System.out.println("Negatif");
        } else if (d==0) {
            System.out.println("Nötr");
        }else{
            System.out.println("Pozitif");
        }
    }
}
