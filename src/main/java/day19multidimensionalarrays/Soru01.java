package day19multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru01 {
    /*
    Kullaniciya kac elemanli bir array girecegini sorun
    Kullaniciya arrayin elemanlarini girmesini soyleyiniz
    a)Bu rarrayin tum elemanlarini ekrana yazdirin
    b) Bu arrayin son elemanini ilk elemani yapun ve tum elemanlarini ekrana yazdirin
   {1,2,3}>>{3,1,2}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aarray`in lenght`ini giriniz");
        int lenght = scan.nextInt();

        int arr[] = new int[lenght];
        int i = 0;
        do{
            System.out.println( "Lutfen array`in index`i " + i + " olan elemani giriniz");
          arr[i] = scan.nextInt();
          i++;

        }while(i<lenght);

        System.out.println(Arrays.toString(arr));
    //Array olustu

    //En son elemani en basa koyalim; Arrayde elemanin yerlerini degistiremeyiz
    //Yeni bir array olusturmaliyiz

    int newArr[] = new int[lenght];//yeni array olusturduk.

    newArr[0] = arr[arr.length-1]; //birinci elemani ilk indexe koyduk
    for (int j = 1; j <arr.length ; j++) {
            newArr[j] = arr[j-1];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
