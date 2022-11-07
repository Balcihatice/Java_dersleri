package day09switchstringmethod;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        Kullanıcı ay ismini girdiğinde o ayın kaç çektiğini ekrana yazan
        program yazınız

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ay ismi giriniz");
        String ay = scan.nextLine().toLowerCase();
        switch (ay){
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralık":
                System.out.println(31);
                break;
            case "subat":
                System.out.println("28 ya da 29");
                break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasım":
                System.out.println(30);
                break;
            default:
                System.out.println("Gecerli bir ay giriniz...");
        }
    }
}
