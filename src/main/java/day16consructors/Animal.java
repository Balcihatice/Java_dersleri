package day16consructors;

public class Animal {

    int age;
    String name;
    int numOfLegs;
    boolean isMammal;

    public Animal() {

        System.out.println("Parametresiz");
    }
    public Animal(String name) {
        this();// constructor çağırmak demektir.önce bunu yapacak ve yukarıyı yazdıracak.
        //bunu kullanarak bir constructor içinde diğer constructorı kullanabiliriz
        System.out.println("Name parametreli");// sonra buna gececek ve yazdıracak.
    }
    public Animal(int age) {

        System.out.println("Age parametreli");
    }
    public Animal(String name, int age) {

        System.out.println("Name ve age parametreli");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Cat");// kullandıgım constructor. Parametreye bakıp nereye gidecegine karar veriyor

    }


}
