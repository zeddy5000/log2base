package kataTest;

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = new int[20];
        SecureRandom random = new SecureRandom();
        for (int i = 0;i < arr.length; i++){
            arr[i] = random.nextInt(20);
        }
        System.out.println("Unsplit array :" +" "+ Arrays.toString(arr) );
        mergeSort(arr);
        for (int num:arr
             ) {
            System.out.print(num);
        }




    }
    private static void mergeSort(int[] unSortedArray) {
        int size = unSortedArray.length;
        if (size < 2) return;

        int midPoint = size / 2;
        int[] leftSide = new int[midPoint];
        int[] rightSide = new int[size - midPoint];

        for (int i = 0; i < leftSide.length; i++) {
            leftSide[i] = unSortedArray[i];
        }
        for (int i = 0; i < rightSide.length; i++) {
            rightSide[i] = unSortedArray[i];
        }
        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(unSortedArray,leftSide,rightSide);



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

