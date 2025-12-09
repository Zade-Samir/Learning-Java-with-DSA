package Sorting;

public class InsertionSort {

    //create the insertion sort function
    public static void useInsertionSort(int arr[]) {

        //loop from 1 to n -1
        for (int i = 1; i < arr.length; i++) {
            //get the curr and prev values
            int curr = arr[i];
            int prev = i - 1;

            //swap if prev is bigger
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //swap with sorted array of current value
            arr[prev + 1] = curr;

        }
    }

    //write function to print values
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //create the main static
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3};
        useInsertionSort(arr);
        printArr(arr);
    }
    
}
