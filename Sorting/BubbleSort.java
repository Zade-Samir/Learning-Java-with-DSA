package Sorting;

public class BubbleSort {

    //write the function
    public static void makeArrSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                //swap the values
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        int arr[] = {5, 4, 2, 3, 1};
        makeArrSort(arr);
        printArr(arr);
    }
}
