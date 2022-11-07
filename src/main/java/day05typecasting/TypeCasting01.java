package day05typecasting;

public class TypeCasting01 {
    public static void main(String[] args) {
      /*  byte< short< int< long< float< double
   kucuk datayı buyuk dataya koymak otomatik yapılır
   Buna "Auto Widening" denir.
 */
       byte b1= 12;
       short s1 = b1;

       int i1 =b1;
       float f1 = b1;

       /*
       büyük data type ı küçük data type a çevirmek istersek
       bu işi java yapmak istemez
       riski biz almalıyız. Bunun ismi "Explicit Narrowing Casting"
       */

        short s2 = 121;
        byte b2 = (byte)s2; //


    }
}
