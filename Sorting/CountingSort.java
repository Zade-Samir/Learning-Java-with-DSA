package Sorting;

public class CountingSort {

    //create the counting function
    public static void countSortArr(int arr[]) {
        //loop for finding max count
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        //loop for count the occurence of elements
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        
        int j = 0;
        //loop for store each occurence elements
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
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

    //create the main function
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countSortArr(arr);
        printArr(arr);
    }
    
}
