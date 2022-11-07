package day23foreachloopdatetime;

public class ForEachSoru01 {
    public static void main(String[] args) {
        /*
        asagida verilen miltidimensional arrayin elemanlari carpimini bulunuz

         */
        int arr[][] = {{2, 3}, {4}, {5, 6}};
        int carpim = 1;
        for (int[] w : arr) {
            for (int k : w) {
                carpim = carpim * k;
            }
        }
        System.out.println(carpim);
    }
}
