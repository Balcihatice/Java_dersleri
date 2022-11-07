package day19multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int ma[][] = new int[3][2];//uzunlugunu soylemek zorundayiz

        //Multidimensional arrayler nasil yazdirilir

        System.out.println(Arrays.deepToString(ma));//derinlemesine yazdir.

        //Eleman ekleme nasil yapilir,
        ma[0][0] = 33;
        ma[0][1] = 32;
        ma[1][0] = 23;
        ma[1][1] = 24;
        ma[2][0] = 13;
        ma[2][1] = 11;
        System.out.println(Arrays.deepToString(ma));//[[33, 32], [23, 24], [13, 11]]

        //[23, 24],arrayini ekrana ayazdirin

        System.out.println(Arrays.toString(ma[1]));//[23, 24]

     //Multidimensional arrayde istenen elemaan nasil yazdirilir or: sadece 13

        System.out.println(ma[2][0]);
//toString array yazdirmaak icin kullanilir , aama bu int oldugundan direk yazdirdik
        System.out.println(ma[1][1]);//24



    }
}
