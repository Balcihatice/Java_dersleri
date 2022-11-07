package day19multidimensionalarrays;

import java.util.Arrays;

public class Arrays_BinarySearch {
    //Bir arrayde belli bir elemanin var olup olmadigini kontrol edelim

    public static void main(String[] args) {

        int a[] = {2, 5, 2, 8, 6};//array olusturmek icin en kisa yol

        //BinarrySearch() meetodu bir arrayde belli bir elemaanin var olup olmadigini kontrol etmek icin kullanilir
        //BinarrySearch() meetodu kullanmadsn once mutlaka sort() metodu kullanilmalidir.
        //sort() kullanmadan buldugumuz sonuc manali olmaz
       //BinarrySearch() meetodu var olan elemanin sort edilmis arraydeki elemaainin indexini verir
        //BinarrySearch() meetodu tekrarli elemanlar icin kullanilmaz

        Arrays.sort(a);//[2,2,5,6,8]

        System.out.println(Arrays.binarySearch(a, 8));//4 >> bu 8`in indexini verir.
        //BinarrySearch() meetodu var olan elemanin sort edilmis arraydeki indexini verir
        System.out.println(Arrays.binarySearch(a, 2));//0
        System.out.println(Arrays.binarySearch(a, 7));//-5

    }


}
