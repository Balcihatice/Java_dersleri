package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
      /*
      if it rains i will go to mall else I will go to picnic
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
      int a =scan.nextInt();
    if (a>=0){
        System.out.println("Negatif değil");
    }else{
        System.out.println("Negatif");
    }
    //NOT: ifelse  sadece bir tane condition içerir.ifif de iki condition vardır
        // java bir conditionı seçer.
        //{} olmasa da if else çalışır ama risklidir.kesinlikle {} kullan

    }
}
