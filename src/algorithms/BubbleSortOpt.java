package algorithms;

import java.security.SecureRandom;

public class BubbleSortOpt {
    public static void main(String[] args) {
        int[] bubbles = {2,33,4,5,6,77,7};

        sortBubble(bubbles);
        dispArray(bubbles);
    }
    private static void sortBubble(int[] array){
        int n = array.length;
        int i = 0,j;
        int temp;
        while (i < n-1){
            for (j = 0; j < n - 1 - i; j++){
                if (array[j] > array[j + 1]){
                  temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
                }
            }
            i++;
        }
    }
    private static void dispArray(int[] arr){
        for (int element: arr
             ) {
            System.out.println(element);

        }
    }
}

