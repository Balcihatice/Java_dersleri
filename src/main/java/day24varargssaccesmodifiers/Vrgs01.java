package day24varargssaccesmodifiers;

public class Vrgs01 {
    /*
    1) Metod parantezi icinde birden fazla parametre varsa varargs her zaman en sonuncu parametre olmalidir.
    2) Metod parantezi icinde birden fazla varags kullanilamaz
     */
    public static void main(String[] args) {
        //varargs hepsi icin calisir
        add(3, 5);
        add(3, 6, 9, 4, 90, 54);
        add();
        add(2);
        birlestirme("Ali", " Can");
        birlestirme("A" + "l" + "i" + " Kahraman");
        birlestirme("Sevda", " Ozcetin");

        yazdir("Isim:", "A","L","I");

    }

//   public static void add(int a, int b) {
//       System.out.println("Toplam : " + (a + b));
//   }
//
//   public static void add(int a, int b, int c) {
//       System.out.println(a + b + c);
//   }


    //    varargs : List gibi davranan bir array dir.Her data type ile calisir,
    public static void add(int... a) {       //a= varargs ismidir
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        System.out.println(sum);
    }
    //Vararg`li bir tane metod yap o butun sayilari toplasin


//Varags kullanarak verilen stringleri birlestiren concat isimli bir metod olusturunuz

    public static void birlestirme(String... concat) {
        String result = "";
        for (String w : concat) {
            result = result + w;
        }
        System.out.println(result);
    }

    public static void yazdir(String a, String...s){
        System.out.println(a);
        for (String w : s) {
            System.out.print(w+ " ");
        }
    }



}
