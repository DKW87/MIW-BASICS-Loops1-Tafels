package controller;

import java.util.Scanner;

/* Dit is een programma dat de gewenste tafel laat zien.
 * Gebruikers moeten daarnaast opgeven hoeveel getallen ze willen zien.
 * De applicatie blijft tafels printen zolang de tafel van 0 niet gekozen wordt.
 * Mvg, Danny Kwant */
public class TafelsMainController {

    public static void main(String[] args) {

        // Variabelen
        int tafel;
        int hoeveelGetallen;
        boolean blijfDraaien = true;

        // Scanner init
        Scanner userInput = new Scanner(System.in);

        while (blijfDraaien) {
            System.out.print("Welke tafel wil je afdrukken? (0 = stoppen) ");
            tafel = userInput.nextInt();

            if (tafel == 0) {
                blijfDraaien = false;
            } else {
                System.out.print("Hoeveel getallen wil je afdrukken? ");
                hoeveelGetallen = userInput.nextInt();

                System.out.println("\nDe tafel van " + tafel + ":");
                for (int i = 0; i <= hoeveelGetallen; i++) {

                    // i + 1 om bij 1 x tafel te beginnen
                    if (i < 1) {
                        i++;
                    }
                    System.out.printf("%6d", (i * tafel));

                    // Printline om de 5 resultaten om niet meer dan 5 resultaten per regel te hebben
                    if (i % 5 == 0) {
                        System.out.println();
                    }

                    // Nadat alle resultaten geprint zijn 2 witregels printen
                    if (i == hoeveelGetallen) {
                        System.out.printf("%n%n");
                    }
                }
            }
        }
    }

}
