package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalarrays_Toplami {
    public static void main(String[] args) {
        int ma[][] = {{11, 5}, {7}, {21, 17, 28}};  //[[11, 5], [7], [21, 17, 28]]

        System.out.println(Arrays.deepToString(ma));
// Herhangi bir indexi nasil yazdirilir
        System.out.println(Arrays.toString(ma[2])); //[21, 17, 28]

//Sadece 17 yi yazdir
        System.out.println(ma[2][1]); //17
//Array ler yazdirilirken toString kullanilir ,Arrayin icindeki eleman sadece sayi oldugundan boyle yazdirilir

        //ma multidimensional arrayinin tum elemanlarini aayni  satirda aralarina bosluk birakarak yazdiriniz
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print(ma[i][j] + " ");//11 5 7 21 17 28
            }
        }
        System.out.println();
//Multidimensional arrayin tum elemanlarinin toplamini ekrana yazdiran kodu yaziniz
        int sum = 0;
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                sum = sum + ma[i][j];
            }
        }
        System.out.println(sum);//89

  // ma multidimensional arrayinin cift olanlarinin karesini yazdiriniz
        for (int i = 0; i < ma.length; i++) {   ///[[11, 5], [7], [21, 17, 28]]
            for (int j = 0; j < ma[i].length; j++) {
                if (ma[i][j]%2==0){
                    System.out.print(ma[i][j]*ma[i][j] +  " ");//784
                }
            }
        }









    }
}
