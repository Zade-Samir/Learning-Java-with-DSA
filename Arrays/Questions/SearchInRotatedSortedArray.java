package Arrays.Questions;

public class SearchInRotatedSortedArray {
    //use the binary search logic
    public static int findIndexOfTarget(int arr[], int target) {

        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            //finding the num value
            int mid = start + (end - start) / 2;

            //if both values are same, return mid as index value
            if (arr[mid] == target) {
                return mid;
            }

            //left part sorted
            if (arr[start] <= arr[mid]) { //checking the left part
                if (arr[start] <= target && target < arr[mid]) { //start <= target && target < mid
                    end = mid - 1; //mid ko ek se kam karo in left part
                }
                else {
                    start = mid + 1; //start ko mid ke right leke start karo in left part
                }
            }
            //right part sorted
            else {
                if (arr[mid] < target && target <= arr[end]) { //mid < target && target <= end
                    start = mid + 1; //start ko mid ke right se start karo in right part
                }
                else {
                    end = mid - 1; //end ko mid ke pahile se start karo in right part
                }
            }
        }
        return -1;
    }

    //write the main function
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findIndexOfTarget(arr, 0));
    }
}
