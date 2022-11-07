package day11stringmetods;

public class ForLoop01 {
    public static void main(String[] args) {
        // ekrana 10 kere "hi" yazdrırn. Birşey tekrar tekrar yapmak zorunda kaldıgımızda
        // aynı kodu bir çok defa yazmak yerne loop kullanırız.
  // for-loop:


  //                burası true ise yazdırır,sonra 1 artırır
        //    ilk şart      son şart       nasıl gidecek
        for (int i= 1    ;    i<=10     ;     i++ ){
            System.out.println("Hi!");
        }
// 100 den 1 e kadar tum sayıları aralarına boşluk bırakarak yazınız.
        for(int i = 100      ;       i>=1            ; i--   ) {
//                             birden buyukse yaz
            System.out.print(i + " ");
        }
    }
}
