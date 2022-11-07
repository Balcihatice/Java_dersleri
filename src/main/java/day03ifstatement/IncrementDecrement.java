package day03ifstatement;

public class IncrementDecrement {
    public static void main(String[] args) {
        /*
        Increment: Bir variable in degerini toplama veya cıkarma yapark artırma
        int i1 = 12;

         */
        int i1 = 12;
        System.out.println(i1);
        //1. yol:
        i1 = i1 + 5;
        System.out.println(i1);
    // i1 8 artır
        i1 = i1 + 8;// 25
        System.out.println(i1);
  //  2.Yol
        i1 += 8; //kısa ve tekrarsız olanı yazmak iyiidir
       i1+= 10;
        System.out.println(i1);
     // 3. yol sadece bir artırmak için kullanılır
       i1++;
        System.out.println(i1);
    int i2 = 3;
    i2+=3;
        System.out.println(i2);
        i2 *= 2;
        System.out.println(i2);
    }
}
