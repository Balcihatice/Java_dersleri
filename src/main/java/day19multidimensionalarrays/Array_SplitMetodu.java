package day19multidimensionalarrays;

import java.util.Arrays;

public class Array_SplitMetodu {
    public static void main(String[] args) {

        // split() metodu
        //Boldugu karakter yok olur elimizde parca parca stringler kalir
        //Bunu bir Array`e atamamiz gerekir

        String s = "Calis bakalim zor Mu?";

        String words1[] = s.split(" ");
        System.out.println(Arrays.toString(words1));//[Calis, bakalim, zor, Mu?]
// Kelime sayisini bulmak icin
        System.out.println(words1.length);//9

//2 space kullanirsak
        String s2 = "Calis  bakalim zor Mu?";
        String words2[] = s2.split(" ");
        System.out.println(Arrays.toString(words2));//[Calis, , bakalim, zor, Mu?]


   // s stringinde kac karakter kullanilmistir

       String w2[]= s.split("");
        System.out.println("Karakter sayisi = " + w2.length);//Karakter sayisi = 21

// s Stringinde bosluk haric kac karakter kullanilmistir split() metodunu kullanarak yaziniz

String words3[]= s.replace(" ", "").split("");
     //bosluk aric karakter sayisi:
        System.out.println(words3.length);//18





    }
}
