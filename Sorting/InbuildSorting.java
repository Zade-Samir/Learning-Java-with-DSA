package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuildSorting {

    public static void main(String[] args) {
        Integer arr[] = {5, 2, 3, 1, 4};

        //for sorting into ascending form
        // Arrays.sort(arr);

        //sorting within some indexes in ascending form
        // Arrays.sort(arr, 0, 3);

        //sorting the array into descending order
        Arrays.sort(arr, Collections.reverseOrder()); //collections.reverseOrder() is applied only on objects, hence we have use Integer in place of 'int'

        for(int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
}
