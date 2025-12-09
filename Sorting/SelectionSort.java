package Sorting;

public class SelectionSort {

    //make arr sort using selection sort
    public static void makeArrSort(int arr[]) {
        //loop for outer first position
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            //loop through inner from i + 1
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }

            //swap the i-th value with minimum element
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    //write function to print values
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //write the main static
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        makeArrSort(arr);
        printArr(arr);
    }
    
}
