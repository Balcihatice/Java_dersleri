package suleymanhocagithup;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {


        int a[] = {2, 7, 1, 3};
        int b[] = {7, 1, 2, 3};
        int c[] = {2, 7, 1, 3};

//According to Java, if two arrays equal to each other, they should same elements in same indexes
// Java'ya göre, iki dizi birbirine eşitse, aynı dizinlerde aynı öğeler olmalıdır
        System.out.println(Arrays.equals(a, b));//false
        System.out.println(Arrays.equals(a, c));//true

        //How to check if 2 arrays have completely same elements
        // 2 dizinin tamamen aynı elemanlara sahip olup olmadığı nasıl kontrol edilir
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b));//true

        String s = "I like Java but Java needs to study hard to learn so study hard";

        String words[] = s.split(" ");

        System.out.println(Arrays.toString(words));//[I, like, Java, but, Java, needs, to, study, hard, to, learn, so, study, hard]
        System.out.println(words.length);//14
        System.out.println(words[4]);//Java

        String words2[] = s.split("t");
        //The character which you used in split() will not be displayed in the array
        System.out.println(Arrays.toString(words2));//[I like Java bu,  Java needs , o s, udy hard , o learn so s, udy hard]

        //Count the number of characters in String "s" by using split()
        String words3[] = s.split("");
        System.out.println(Arrays.toString(words3));
        System.out.println(words3.length);//63

        //Count the number of characters except " " in String "s" by using split()
        String words4[] = s.replace(" ", "").split("");
        System.out.println(Arrays.toString(words4));
        System.out.println(words4.length);//50

        //Count how many "s" are there in the String "s".
        int counter = 0;
        for (int i = 0; i < words4.length; i++) {
            if (words4[i].equals("b")) {
                counter++;
            }
        }
        System.out.println("The number of the character: " + counter);


    }

    }
