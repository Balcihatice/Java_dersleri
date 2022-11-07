package day16consructors;

public class MethodCreations {

    public static void main(String[] args) {

        System.out.println(add(3, 5));
        System.out.println(concat("Merhaba ", "Dunya!"));
    }

    //Method olustururken void disinda bir return type kullanirsak metod bodysi icinide en son satirda return keyword kullanilmali
    //aksi halde Compile time Error aliriz
    //Void disinda return type olarak tum primitive ve tum nun primitiv`lerin hepsi kullanilabilir.
    public static int add(int a, int b) {
        return a + b;

    }

    // Iki tane String``i cancayenate  eden ve Stringi return eden bir method yaziniz
    //Bu methodu main method icinde cagirip String`i ekrana yazdirinz
    public static String concat(String a, String b) {
        return a.concat(b);
    }
}
