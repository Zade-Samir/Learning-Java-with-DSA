/*
Question 1: Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2, 3, 1]
Output: true
Example 2:
Input: nums = [1,2, 3, 4]
Output: false
Example 3:
Input: nums = |1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
Output: true
Constraints:
1 <= nums. length <= 105
-109 <= nums [i|<= 10º
*/

package Arrays.Questions;

public class ElementAppreanceMoreThanTwice {

    public static boolean isDuplicateElement(int arr[]) {

        //find the largest element
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        //find the occurence of each element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int value : count) {
            System.out.print(value + " ");
        }
        System.out.println();

        //find element greater than 2 occurence
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(isDuplicateElement(arr));
    }
    
}
