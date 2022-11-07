package day13whileloop;

public class ForLoop02 {
    public static void main(String[] args) {

        /*
        For loop kullanılarak aşagıda verilen şekli oluşturunuz
        *
        **
        ***
        ****
        *****

         */
        // i: satır sayısı
        // k: yıldız sayısı

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();// bu loop kırılınca alt satıra gecmeyi sağlıyor
        }
    }
}
