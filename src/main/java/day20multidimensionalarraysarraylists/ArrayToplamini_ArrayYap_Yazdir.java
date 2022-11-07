package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class ArrayToplamini_ArrayYap_Yazdir {
    public static void main(String[] args) {

        //Asagidaki Multidimensional array`in tum elemaanlarini toplamini birer birer
        // ve herbiri sonucu yeni bir array`in elemani yapan ve yeni aarrayi ekrana yazdiran
        // bir program yaziniz
        //Or: {{1,2,3},{4,5},{6,7}}>>> output : {6,9,13}

        int arr[][] = {{10, 20, 30}, {4, 5}, {6, 7}};
        int toplam = 0;
        int brr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam = toplam + arr[i][j];
            }
            brr[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(brr)); // [60, 9, 13]


    }
}
