package algorithms;

import java.security.SecureRandom;

public class QuickSortOpt {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(99);
        }
        quickSort(numbers,0,numbers.length-1);
        displayArray(numbers);

    }
    private static void displayArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    private static void quickSort(int[] array,int lowIndex,int highIndex){
        if (lowIndex >= highIndex)return;
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array,leftPointer, rightPointer);
        }
        swap(array,leftPointer,highIndex);
        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);
    }
    private static void swap(int[] array,int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
