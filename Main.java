package com.company;

public class Main {
    /**
     * Sadman Sakib
     * Note to Viewer/Employer:
     *
     * Bubblesort is elementary sorting algorithm that compares the element at array[i] and array[i+1] and rearranges it to the correct
     * position whether the user selected ascending or descending.
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {4, 5, 7, 6, 9, 10,67,6,45};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
System.out.print(array[i]);
        }
    }
    }
