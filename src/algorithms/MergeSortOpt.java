package algorithms;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortOpt {
    public static void main(String[] args) {
        int [] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++){
            SecureRandom random = new SecureRandom();
            int randNum = random.nextInt(999);
            numbers[i] = randNum;
        }
        mergeSort(numbers);
        printSortedArray(numbers);


    }

    private static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static void mergeSort(int[] unsortedArray){
        if (unsortedArray.length < 2) return;
        int arrayLenght = unsortedArray.length;
        int midPoint = arrayLenght/2;

        int[] letfArray = new int[midPoint];
        int[] rightArray = new int[arrayLenght - midPoint];

        for (int i = 0; i < midPoint; i++){
            letfArray[i] = unsortedArray[i];
        }
        for (int i = midPoint; i < arrayLenght; i++ ){
            rightArray[i - midPoint] = unsortedArray[i];
        }

        mergeSort(letfArray);
        mergeSort(rightArray);

        merge(unsortedArray,letfArray,rightArray);

    }
    private static void merge(int[] lastArray, int[] leftArray, int[] rightArray){
        int i =0, j=0, k=0;
        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] <= rightArray[j]){
                lastArray[k] = leftArray[i];
                i++;
            }
            else {
                lastArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArray.length){
            lastArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length){
            lastArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

}
