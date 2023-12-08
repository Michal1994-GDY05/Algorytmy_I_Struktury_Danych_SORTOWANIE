package Zadanie_1.Dane.Manual_data_entry;

import java.util.Scanner;

public class Manual_data_entry {

    public static int[][] readManually() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę par liczb całkowitych: ");
        int rows = scanner.nextInt();

        int[][] array = new int[rows][2];

        for (int i = 0; i < rows; i++) {
            System.out.print("Podaj pierwszą współrzędną dla pary " + (i + 1) + ": ");
            array[i][0] = scanner.nextInt();

            System.out.print("Podaj drugą współrzędną dla pary " + (i + 1) + ": ");
            array[i][1] = scanner.nextInt();
        }

        return array;
    }
}
