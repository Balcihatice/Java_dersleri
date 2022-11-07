package day19multidimensionalarrays;

import java.util.Arrays;

public class Arrayler_EsitMi {
    public static void main(String[] args) {
        String s1[] = {"A","D","C"};
        String s2[] = {"A","C","D"};
        String s3[] = {"A","C","D"};
      //Esit olmanin sarti ayni indexte ayni eleman vardir

        System.out.println(Arrays.equals(s1, s2));//false

        System.out.println(Arrays.equals(s2,s3));//true
        //System.out.println(Arrays.equals(s2,s2));//true
    }
}
