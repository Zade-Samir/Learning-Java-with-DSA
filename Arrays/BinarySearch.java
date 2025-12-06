package Arrays;

public class BinarySearch {

    public static int BinarySearchFunction(int arr[], int key) {

        //create the start and end
        int start = 0, end = arr.length - 1;

        //comparisons start here
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) { //middle value
                return mid;
            }
            else if (arr[mid] < key) { //right side
                start = mid + 1;
            }
            else {
                end = mid - 1; //left side
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int key = 4;
        System.out.println("Value is at index " + BinarySearchFunction(arr, key));
    }
    
}
