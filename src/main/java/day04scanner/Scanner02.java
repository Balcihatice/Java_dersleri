package day04scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isim giriniz");
        String name = scan.nextLine();
        System.out.println(name);

        // data type String olunca nextline() kullan
        // data type String olunca  next() kullanılabilir
        // ama next() metodu sadece ilk kelimeyi alır
        // nextLine() ise kullanıcının girdiği tüm Stringi alır

    }
}
