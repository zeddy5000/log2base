package algorithms;

public class OptimizedBubble {
    public static void main(String[] args) {
        int [] myArr = {32,3,55,3,1,7,86,6,3};
        bubbleSort(myArr);
        dispArr(myArr);
    }

    private static void bubbleSort(int[] rawArr) {
        int i,j,temp;
        for(i = 0; i < rawArr.length-1; i++){
            boolean swapped = false;
            for(j = 0; j < i -1; j++){
                if(rawArr[j] > rawArr[j + 1]){
                    temp = rawArr[j];
                    rawArr[j] = rawArr[j + 1];
                    rawArr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
    }
    private static void dispArr(int [] sortedArr){
        int i;
        for(i = 0; i < sortedArr.length-1; i++){
            System.out.print(sortedArr[i] + " ");
        }
    }
}
