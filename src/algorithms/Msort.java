package algorithms;

import java.security.SecureRandom;
import java.util.Arrays;

public class Msort {
    public static void main(String[] args) {
        int[] unsortedArr = new int[15];
        SecureRandom rand = new SecureRandom();

        for (int i = 0; i < unsortedArr.length; i++) {
            unsortedArr[i] = rand.nextInt(99);
        }
        mergeSort(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr));
    }
    private static void mergeSort(int[] arr){
        int n = arr.length;
        int midPoint = n/2;
        if (arr.length < 2) return;
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[n-midPoint];

        for (int i = 0; i < midPoint; i++){
            leftArray[i] = arr[i];
        }
        for (int i = midPoint; i < n; i++){
            rightArray[i-midPoint] = arr[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(arr,leftArray,rightArray);

    }
    private static void merge(int[] sortedArr, int[] leftArr, int[] rightArr){
        int l = leftArr.length;
        int r = rightArr.length;
        int i = 0, j = 0, k = 0;
        while (i < l && j < r){
            if (leftArr[i] <= rightArr[j]){
                sortedArr[k] = leftArr[i];
                i++;
            }
            else {
                sortedArr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < l){
            sortedArr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < r){
            sortedArr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
