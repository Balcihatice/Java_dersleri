package day16consructors;

public class Constructors01 {
    /*
    1) Constructorun ismi class ismi ile aynı olmalıdır
    2)
    Constructor oluştururken class ismi yazıldıktan sonra () konulmalıdır
    3) Class oluşturuldugunda java bu class dan object oluşturacağını duşunerek "constructor" oluşturur
    4) Siz kendiniz constructor ürettiginizde , java default constructor'i iptal eder.
    5) Constructor üreterek bir Class tan cok farklı object ler üretebiliriz.
    6) Constructor larda return type yopktur.Bu yüzden constructorlar metod degildirler(MÜLAKATTA SORULUR)
   CONSTRUCTORLAR CONSTRUCTOR' DIRLAR
   7) CONSTRUCTORLAR DA SADECE CLASS İSMİ, İSİM OLARAK KULLANILABİLİR.FAKAT metodlarda isim olarak herşey kullanılabilir.
   8) bir classta ne kadar constructor oluşturursak o kadar constructor vardır
     */

    public Constructors01() { // constructor object üretmek için lazım

    }



    public static void main(String[] args) {


        // class ismi      Object ismi      New keyword        Constructor
        Constructors01 obj1 = new Constructors01();

    }
}