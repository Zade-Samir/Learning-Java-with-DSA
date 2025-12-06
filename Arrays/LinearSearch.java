package Arrays;

public class LinearSearch {

    public static int LinearSearchFun(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = LinearSearchFun(arr, key);
        if (index == -1) {
            System.out.println("Key Not found");
        }
        else {
            System.out.println("Key found at index : " + index);
        }
    }
}
