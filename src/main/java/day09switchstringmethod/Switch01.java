package day09switchstringmethod;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Switch statement, if-else-if ile aynı işi yapar
        Switch statement daha kolay yazılır daha kolay okunur
        İkiden fazla durum varsa if-else-if yerine switch kullanılır.
         */


  /*
  Kullanıcı hafta gününün sayısını girsin program haftanın gününü yazsın
  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun sayısını girin");
        int gun = scan.nextInt();

//if-else-if
//   if (gun == 1) {
//      System.out.println("Pazartesi");
//    else if (gun == 2){
//      System.out.println("Sali");
//   else if (gun == 3) {
//      System.out.println("Carsamba");
//   else if (gun == 4) {
//      System.out.println("persembe");
//   else if (gun == 5) {
//      System.out.println("Cuma");
//   else if (gun == 6) {
//      System.out.println("Cumartesi");
//   else if (gun == 7){
//      System.out.println("Pazar");
//   else{
//      System.out.println("Geçerli gun sayisi giriniz...");
//

   //switch 
        switch (gun){
         case 1 :
             System.out.println("Pazartesi");
             break;
         case 2 :
                System.out.println("Sali");
                break;
         case 3:
                System.out.println("Carsamba");
                break;
         case 4 :
                System.out.println("Persembe");
                break;
         case 5 :
                System.out.println("Persembe");
                break;
         case 6 :
                System.out.println("Persembe");
                break;
         case 7 :
                System.out.println("Persembe");
                break;
            default:
                System.out.println("Gecerli gun giriniz");
        }

        /*
        ödev:   bir gunden başlayacağız ve haftanın son gunune kadar yazacak dersek
        brekleri kaldıracağız
         */



    }


    }

