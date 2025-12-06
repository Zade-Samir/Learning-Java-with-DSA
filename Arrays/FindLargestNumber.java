package Arrays;

public class FindLargestNumber {

    public static String LargestNumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
            if (smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return "" + largest + " " + smallest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 5, 4};

        String largest = LargestNumber(arr);
        System.out.println("Largest Value from arr is " + largest);
    }
}