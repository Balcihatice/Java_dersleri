package day11stringmetods;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
/*
1) Kullanıcıdan passwordünü alınız
2) Passwordün ilk karakteri büyük harf olacak
3) son karakteri sayı olacak
4) en az 6 character uzunlugunda olacak
şartlarını sağlıyorsa "Password başarıyla oluşturuldu" yazdırınız
Passwoed yukarıdaki şaetlardan herhangi birini sağlamıyorsa "Tekrar denenyiniz" yazdırın

 */
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen password ünüzü giriniz...");
        String pwd = input.nextLine();
        if((pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') &&
                (pwd.charAt(pwd.length()-1)>='0' && pwd.charAt(pwd.length()-1)>=9) &&
                pwd.length()>5){

        }else {
            System.out.println("Tekrar deneyiniz...");
        }












    }
}
