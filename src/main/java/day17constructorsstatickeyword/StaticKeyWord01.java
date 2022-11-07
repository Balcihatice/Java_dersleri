package day17constructorsstatickeyword;

public class StaticKeyWord01 {

    int i; //instance variable,>> class`in icinde Method`un disindaki variablera instance variable denir
     //class`in icinde Method`un disindaki variablera static variable`lara class vaariable denir
     //Instance variable`lara Class variable`lar icin de default degerler vardir.
     //Instance variablelar obj icin uretilir
     //Instance olanlara ulasmak icin obj olusturmak zorundayiz,obj olusturmadan instance variable`a ulasilamaz 

    static int k; //static olmak classa yapistirilmis olmak deektir,
    // Class icin static variable uretilir,
    // Child classlar Statik variable`i gorur ve kullanabilir.
    // Butun objectler kullanavilir
    // Static variable degisirse bunu kullanan tum object`ler etkilenir.

    public static void main(String[] args) {

    }

}
