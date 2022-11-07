package day19multidimensionalarrays;

public class Interviev {
    public static void main(String[] args) {
     //   Bir stringde kullanilan tum harflerin sayisini gosteren kodu yaziniz.
     //Alaaddin >> A=1 , l+1,  a=2, d=2, i=1, n=1

        /*
        Şu şekil yapsak olmaz mı ilk önce içinde geçen harfleri bir stringe kaydelim daha sonra
         bu stringin uzunluğunda bir array oluşturalım. Sonrasında oluşturduğumuz stringdeki harflerin
         ana stringde kaç defa geçiyor ona bakıp sayıyı arraye kaydederiz.
         Örnek üzerinde göstermek gerekirse Masa oluşturacağımız string Mas olur buna bağlı array ise{1,2,1} olur


         */
        String str="Java guzeldir";
        String harf = "";
        for(int i=0; i<str.length(); i++){
            String c = str.substring(i,i+1);
            if(!harf.contains(c)) {
                harf = harf + c;
            }
        }
        System.out.println(harf);

        for(int i=0;i<harf.length();i++){
            int flag=0;
            for(int j=0;j<str.length();j++){
                if(harf.charAt(i)==str.charAt(j)){
                    flag++;
                }

            }
            System.out.print(harf.charAt(i)+" = "+flag+", ");
        }



    }
}
