package day12forloop;

import java.util.Scanner;

public class ForLoop07 {
    public static void main(String[] args) {
       /*
       3 ten 6 ya kadar tum tamsayıların çarpımını yazdırn prıgram yazınız 
        */

        int carpim = 1;
        for (int i = 3; i <= 6; i++) {
            carpim = carpim * i;
        }
        System.out.println("carpım = " + carpim);

//Bundan sonrasi grup calismasindan geldi

        //Kullanicidan alinan stringi ters ceviriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String issim = scan.nextLine();
        String ters = "";
        for (int i = issim.length() - 1; i > -1; i--) {
            char isim = issim.charAt(i);
            ters = ters + isim;
        }
        if (ters.equals(issim)){
            System.out.println("Bu palindrom dur");
        }else{
            System.out.println("Palindrom degil");
        }
// fakktoriyel hesabi
//Ask a number from user less than 10.find the factorial.
        System.out.println("enter a number less than 10:");
        int num2=scan.nextInt();
        int multiply=1;

        if (num2>=10){
            System.out.println("wrong number ");
        }else{
            for (int i=num2; i>0; i--){
                multiply=multiply*i;
            }
            System.out.println(multiply);

        }
        System.out.println();

// *
// **
// ***
// **** sekli olusturun

        for (int i= 1; i<=4; i++){   //satir


            for (int k= 1; k<=i; k++){   // sutun yildizlari koyduk


                System.out.print("*");
            }
            System.out.println();
        }







    }
}
