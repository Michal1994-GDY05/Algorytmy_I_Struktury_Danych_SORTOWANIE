package Zadanie_3;

public class QuickSortWithInsertionSort {

    public static void main(String[] args) {

        String[] array = {"apple", "Orange", "banana", "Grapes", "kiwi", "Cherry", "pear", "Strawberry", "mango", "pineapple"};

        System.out.println("Tablica przed sortowaniem:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nTablica po sortowaniu:");
        printArray(array);
    }
}

