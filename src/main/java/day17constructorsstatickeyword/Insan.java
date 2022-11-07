package day17constructorsstatickeyword;

public class Insan {
    int age;
    String name;
    int height;
    boolean isHonest;
    String job;
    String gender;//cinsiyet

    //hemen parametresiz constructor oluşturalum
    public Insan() {

        System.out.println("Parametresiz");
    }

    public Insan(String name) {
        this();
        System.out.println("Name parametreli");
    }

    public Insan(String job, String gender) {
        this("Veli");
        System.out.println("Job ve gender parametreli");
    }


    public static void main(String[] args) {
        Insan i1 = new Insan("Doctor","Bayan");

    }
}
