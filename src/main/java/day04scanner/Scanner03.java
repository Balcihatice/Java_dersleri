package day04scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Alfabeden bir harf gir...");
        char harf = scan.next().charAt(0);   // char böyle alınır başka türlü alınmaz

        System.out.println(harf);

    }
}
