package Arrays;

public class MaxSubarraySumKadanes {

    public static void findByKadanes(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        //if some are +ve values
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        // System.out.println("max value is " + maxSum);

        // int currSum = arr[0];
        // int maxSum = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        //     //find max between previous or current + sum, if not max start from that point
        //     currSum = Math.max(currSum, currSum + arr[i]);

        //     //find the max between maxsum and currsum
        //     maxSum = Math.max(maxSum, currSum);
        // }
        System.out.println("Max value is " + maxSum);
    }

    public static void main(String[] args) {
        // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        findByKadanes(arr);
    }
    
}
