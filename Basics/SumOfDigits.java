package Basics;
public class SumOfDigits {
    
    public static void main(String[] args) {
        
        int input = 12345;
        String inputIntoString = String.valueOf(input);
        int totalSum = 0;

        for (int i = 0; i < inputIntoString.length(); i++) {
            int value = inputIntoString.charAt(i) - 48;
            System.out.println(value);
            totalSum += value;
        }
        System.out.println(totalSum);
        
    }
}
