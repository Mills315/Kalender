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

        // kan ik deze 'dagen' in één grote list krijgen? of in een arraylist die uit arraylists bestaat? makkelijker met de for loop && printen

        ArrayList<Integer> Maandag = new ArrayList<>();
        ArrayList<Integer> Dinsdag = new ArrayList<>();
        ArrayList<Integer> Woensdag = new ArrayList<>();
        ArrayList<Integer> Donderdag = new ArrayList<>();
        ArrayList<Integer> Vrijdag = new ArrayList<>();
        ArrayList<Integer> Zaterdag = new ArrayList<>();
        ArrayList<Integer> Zondag = new ArrayList<>();

        // Als een date een bepaalde dag is, zet hem dan in het juiste array. Doet dit voor elke dag in jaar.


        for (LocalDate date = LocalDate.of(jaar, Month.JANUARY, 1); date.isBefore(LocalDate.of((jaar + 1), Month.JANUARY, 1)); date = date.plusDays(1)) {
            // lukt dit me ook met een switch en enum?
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {Maandag.add(date.getDayOfMonth());}
            if (date.getDayOfWeek() == DayOfWeek.TUESDAY) {Dinsdag.add(date.getDayOfMonth());}
            if (date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {Woensdag.add(date.getDayOfMonth());}
            if (date.getDayOfWeek() == DayOfWeek.THURSDAY) {Donderdag.add(date.getDayOfMonth());}
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {Vrijdag.add(date.getDayOfMonth());}
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {Zaterdag.add(date.getDayOfMonth());}
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {Zondag.add(date.getDayOfMonth());}
        }
         int count = 0;

        for (int i = 0; i < Maandag.size(); i++) {
            if (i != (Maandag.size()) - 1) {
                System.out.print(Maandag.get(i));
                if (Maandag.get(i + 1) < Maandag.get(i)) {
                    if ((count == 3)||(count == 7)) {
                        System.out.println();
                        count++;
                    } else {
                        count++;
                        System.out.print("  |  ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            if (i == Maandag.size() - 1) {
                System.out.print(Maandag.get(i));
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i < Dinsdag.size(); i++) {
            if (i != (Dinsdag.size()) - 1) {
                System.out.print(Dinsdag.get(i));
                if (Dinsdag.get(i + 1) < Dinsdag.get(i)) {
                    if ((count == 3)||(count == 7)) {
                        System.out.println();
                        count++;
                    } else {
                        count++;
                        System.out.print("  |  ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            if (i == Dinsdag.size() - 1) {
                System.out.print(Dinsdag.get(i));
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i < Woensdag.size(); i++) {
            if (i != (Woensdag.size()) - 1) {
                System.out.print(Woensdag.get(i));
                if (Woensdag.get(i + 1) < Woensdag.get(i)) {
                    if ((count == 3)||(count == 7)) {
                        System.out.println();
                        count++;
                    } else {
                        count++;
                        System.out.print("  |  ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            if (i == Woensdag.size() - 1) {
                System.out.print(Woensdag.get(i));
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i < Donderdag.size(); i++) {
            if (i != (Donderdag.size()) - 1) {
                System.out.print(Donderdag.get(i));
                if (Donderdag.get(i + 1) < Donderdag.get(i)) {
                    if ((count == 3)||(count == 7)) {
                        System.out.println();
                        count++;
                    } else {
                        count++;
                        System.out.print("  |  ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            if (i == Donderdag.size() - 1) {
                System.out.print(Donderdag.get(i));
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i < Vrijdag.size(); i++) {
            if (i != (Vrijdag.size()) - 1) {
                System.out.print(Vrijdag.get(i));
                if (Vrijdag.get(i + 1) < Vrijdag.get(i)) {
                    if ((count == 3)||(count == 7)) {
                        System.out.println();
                        count++;
                    } else {
                        count++;
                        System.out.print("  |  ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            if (i == Vrijdag.size() - 1) {
                System.out.print(Vrijdag.get(i));
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i < Zaterdag.size(); i++) {
            if (i != (Zaterdag.size()) - 1) {
                System.out.print(Zaterdag.get(i));
                if (Zaterdag.get(i + 1) < Zaterdag.get(i)) {
                    if ((count == 3)||(count == 7)) {
                        System.out.println();
                        count++;
                    } else {
                        count++;
                        System.out.print("  |  ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            if (i == Zaterdag.size() - 1) {
                System.out.print(Zaterdag.get(i));
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i < Zondag.size(); i++) {
            if (i != (Zondag.size()) - 1) {
                System.out.print(Zondag.get(i));
                if (Zondag.get(i + 1) < Zondag.get(i)) {
                    if ((count == 3)||(count == 7)) {
                        System.out.println();
                        count++;
                    } else {
                        count++;
                        System.out.print("  |  ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            if (i == Zondag.size() - 1) {
                System.out.print(Zondag.get(i));
                System.out.println();
                count = 0;
            }
        }



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


        // System.out.println(eenJanuari.getDayOfWeek());

        if (yoran.getSchrikkeljaar() == true) {
            System.out.println("TRUE");
        }


    }

}




