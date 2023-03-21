package kataTest;

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeStTest {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        SecureRandom rand = new SecureRandom();
        for (int i =0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(20);
        }
        mergeSort(numbers);
        displayArray(numbers);
    }

    private static void mergeSort(int[] array) {
        if (array.length < 2)return;
        int size = array.length;
        int midPoint = array.length/2;
        int[] leftSide = new int[midPoint];
        int[] rightSide = new int[size - midPoint];

        for (int i = 0; i < midPoint; i++){
            leftSide[i] = array[i];
        }
        for (int i = midPoint; i < size; i++ ){
            rightSide[i - midPoint] = array[i];
        }
        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(array,leftSide,rightSide);
    }

    private static void merge(int[] array, int[] leftSide, int[] rightSide) {
        int i = 0, j = 0, k = 0;
        while(i < leftSide.length && j < rightSide.length){
            if (leftSide[i] <= rightSide[j]){
                array[k] = leftSide[i];
                i++;
            }
            else {
                array[k] = rightSide[j];
                j++;
            }
            k++;
        }
        while (i < leftSide.length){
            array[k] = leftSide[i];
            i++;
            k++;
        }
        while (j < rightSide.length){
            array[k] = rightSide[j];
            j++;
            k++;
        }
    }
    private static void displayArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
