package KalenderMaken;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // maak een kalender

        // maak een methode(jaar, maand) die een bepaalde maand in een bepaald jaar goed output op het scherm; inclusief weeknummer

        // maak een methode( * ) die van een bepaalde maand in een bepaald jaar bedenkt op welke dag die start en hoeveel dagen die heeft

        // maak een methode die dagen in een maand kan vertellen

        // maak een methode die de eerste dag van de maand weet

        // als elke week een array is die van 0 - 6 loopt -- eerste dag op goede weekdag -- jaar is een list met 52 arrays --

        // een maand is een array van 42 velden . stipjes voor eraan en achteraf eraf als de eerste dag wel of niet een maandag is

        // maak een array voor bijvoorbeeld maandag : voor alle dagen in een jaar, check welke dag en plaats ze in array voor die dag;

        int jaar = 1987;
        Jaar yoran = new Jaar(jaar);

        System.out.println("JANUARI|                  |");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("   Week| 1  2  3  4  5  6 |");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("    Mon|                  |");
        System.out.println("    Tue|                  |");
        System.out.println("    Wed|                  |");
        System.out.println("    Thu|                  |");
        System.out.println("    Fri|                  |");
        System.out.println("    Sat|                  |");
        System.out.println("    Sun|                  |");
        System.out.println("--------------------------------------------------------------------------------------------");

        ArrayList<String> Maandag = new ArrayList<>();
        ArrayList<String> Dinsdag = new ArrayList<>();
        ArrayList<String> Woensdag = new ArrayList<>();
        ArrayList<String> Donderdag = new ArrayList<>();
        ArrayList<String> Vrijdag = new ArrayList<>();
        ArrayList<String> Zaterdag = new ArrayList<>();
        ArrayList<String> Zondag = new ArrayList<>();


        for (LocalDate date = LocalDate.of(jaar, Month.JANUARY, 1) ; date.isBefore(LocalDate.of((jaar+1), Month.JANUARY, 1)) ; date = date.plusDays(1)) {

            // lukt dit me ook met een switch en enum?

            if(date.getDayOfWeek() == DayOfWeek.MONDAY){
                Maandag.add(String.valueOf(date.getDayOfMonth()));
            }
            if(date.getDayOfWeek() == DayOfWeek.TUESDAY){
                Dinsdag.add(String.valueOf(date.getDayOfMonth()));
            }
            if(date.getDayOfWeek() == DayOfWeek.WEDNESDAY){
                Woensdag.add(String.valueOf(date.getDayOfMonth()));
            }
            if(date.getDayOfWeek() == DayOfWeek.THURSDAY){
                Donderdag.add(String.valueOf(date.getDayOfMonth()));
            }
            if(date.getDayOfWeek() == DayOfWeek.FRIDAY){
                Vrijdag.add(String.valueOf(date.getDayOfMonth()));
            }
            if(date.getDayOfWeek() == DayOfWeek.SATURDAY){
                Zaterdag.add(String.valueOf(date.getDayOfMonth()));
            }
            if(date.getDayOfWeek() == DayOfWeek.SUNDAY){
                Zondag.add(String.valueOf(date.getDayOfMonth()));
            }









        }

        System.out.println(Maandag);
        System.out.println(Dinsdag);
        System.out.println(Woensdag);
        System.out.println(Donderdag);
        System.out.println(Vrijdag);
        System.out.println(Zaterdag);
        System.out.println(Zondag);


        // Als een date een bepaalde dag is, zet hem dan in het volgende array. Doet dit voor elke dag in jaar.




        LocalDate eenJanuari = LocalDate.of(jaar, Month.JANUARY, 1);
        LocalDate eenFebruari = LocalDate.of(jaar, Month.FEBRUARY, 1);
        LocalDate eenMaart = LocalDate.of(jaar, Month.MARCH, 1);
        LocalDate eenApril = LocalDate.of(jaar, Month.APRIL, 1);
        LocalDate eenMei = LocalDate.of(jaar, Month.MAY, 1);
        LocalDate eenJuni = LocalDate.of(jaar, Month.JUNE, 1);
        LocalDate eenJuli = LocalDate.of(jaar, Month.JULY, 1);
        LocalDate eenAugustus = LocalDate.of(jaar, Month.AUGUST, 1);
        LocalDate eenSeptember = LocalDate.of(jaar, Month.SEPTEMBER, 1);
        LocalDate eenOktober = LocalDate.of(jaar, Month.OCTOBER, 1);
        LocalDate eenNovember = LocalDate.of(jaar, Month.NOVEMBER, 1);
        LocalDate eenDecember = LocalDate.of(jaar, Month.DECEMBER, 1);



        System.out.println(eenJanuari.getDayOfWeek());

        if (yoran.getSchrikkeljaar() == true) {
            System.out.println("TRUE");
        }


    }

}




