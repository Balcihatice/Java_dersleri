package day23foreachloopdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Java`da LocalDate Class`i var,
        LocalDate date1 = LocalDate.now();//now metodu bugunun tarihine ozel object olusturuyor
        System.out.println(date1); //O gunun tarihini yazar,2022-10-24

        System.out.println(date1.plusDays(3));// tarihe 3 gun ekler
        System.out.println(date1.plusMonths(2));//2022-12-24 sadece ay degisir

        System.out.println(date1.plusYears(1));//2023-10-24 1 Yil artti,
        System.out.println(date1.plusWeeks(2));//2022-11-07 2 hafta ekledi

//eski`ye gtmek icin minus() metodu vardir
        System.out.println(date1.minusDays(10));// 2022-10-14 10 gun geriye gittik
        System.out.println(date1.minusMonths(11));//2021-11-24 11 ay oncesine gittik

        // 3 yil ileri 4 ay geri gittik
        System.out.println(date1.plusYears(3).minusMonths(4));//2025-06-24


// Java`da LocalTime Class`i var

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);//10:48:16.679112

        System.out.println(time1.plusMinutes(12));//12 dakika ekler
        System.out.println(time1.plusHours(3));// 3 saat artti


        System.out.println(time1.minusMinutes(13));// //13 dakika geri gittik
        System.out.println(time1.minusHours(3));// 3 saat geri gittik


//Baska ulkelerin saatini bulma
        LocalTime time2 = LocalTime.now(ZoneId.of("Japan"));//JAponyanin suanki saati
        System.out.println(time2);


  //Tarihlerin formatlarini degistirmek
       //Tarih formatlarini degistirmek icin" DateTimeFormetter" Calssini kullaniriz

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               //                degistir        kalipini degistir  ( gun/ ay/ yil)

     //  Minute: m
     // Ay:MM
        System.out.println(date1.format(dtf1));//24/10/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(date1.format(dtf2));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        System.out.println(date1.format(dtf3));//24/Eki/22 ay isminin ilk 3unu yazar

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        System.out.println(date1.format(dtf4));// MMMM ay ismini tam yazar

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("d/MMMM/yy");
        System.out.println(date1.format(dtf5));// d onunde sifirsiz rakamlari yazar


//Bu sekilde degistirerek istedigimiz gibi formet olusturabiliriz
        //Sadece gun ve yil

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MMMM/d");
        System.out.println(date1.format(dtf6)); //Ekim/24



//Zaman formatini degistirmek

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("hh:mm");//hh 12 lik saat formatidir. HH 24 saatlik formattir
        System.out.println(time1.format(dtf7) + " pm");//11:14 pm






    }
}
