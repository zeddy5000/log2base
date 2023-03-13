package algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nuym = {5,45,7,8,1,3,33};
        bubbleSorter(nuym);
        dispArray(nuym);
    }
    private static void bubbleSorter(int [] intArray){
        int n = intArray.length;
        for(int i = 0; i < n-1;i++){
           for(int j = 0;j < n-i-1; j++){
               if(intArray[j] > intArray[j  + 1]){
                   int temp = intArray[j];
                   intArray[j] = intArray[j + 1];
                   intArray[j+1] = temp;
               }
           }
        }
    }
    private static void dispArray(int [] sortedArr){
        for(int element : sortedArr)System.out.print(element);
    }
}
