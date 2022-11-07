package day24varargssaccesmodifiers;

import day23foreachloopdatetime.AccessModifier03;

public class AccessModifier02 {
    public static void main(String[] args) {
        // Intance variableye ulasmak icin object ile ulasabiliriz

        /*
        "Private" Class member`lar sadece icinde bulunduklar class`larda kullanilabilirler.
        Baska Class`lardan "private" Class memberlari kullanmak mumkun degildir
        2) Baska packageden object olusturursaniz, object olusturaulan class`i import etmeniz gerekir
        3) Baska packageden default Class member`lara ulasamayiz,
        Ayni packagede iseniz ulasabilirsiniz

        private: diger classlardan erisimi engelliyor,
        default: diger packageden ulasimi engelliyor,(obj3 e bak)

        4) public Class memberlara herkes heryerden ulasabilir

        5) Protected: Parent Classin cocuklari olur,onlar child classdir.Bir cocugun iki ailesi olamaz.
        Protected oldugu zaman baska packagede olsak bile child classlar ulasabilir
        cocuk degilse ulasamaz.
         Ayni packagede olan Classlardan defaulta ulasmada sorun olmaz= Ulasabilir
         Farkli packagede iseniz
         i) child class ise ulasabilir
         ii) Child Class degilseniz ulasamazsiniz
         6) Class`larda access modifier kullanilir Ama sadece public ve default access modifier kullanilabilir.
         Class olustururken private ve protected kullanilmaz
         */

        AccessModifier01 obj1 = new AccessModifier01();// object olusturduk

        System.out.println(obj1.publicAge);
        System.out.println(obj1.protectedAge);
        System.out.println(obj1.defaultAge);

      //private`i bu class`ta kullanamazyiz


        AccessModifier03 obj3 = new AccessModifier03();
        System.out.println(obj3.publicName);
        //
    }
}
