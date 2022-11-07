package day19multidimensionalarrays;

public class Array_KacKarakterVar {
    public static void main(String[] args) {

        //String de kac tane "a" var


        String s = "Calis bakalim zor Mu?";
        String word[] = s.split("");
        int counter = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals("a")) {
                counter++;
            }
        }
        System.out.println("Sorulan karakter`in sayisi: " + counter);


    }
}
