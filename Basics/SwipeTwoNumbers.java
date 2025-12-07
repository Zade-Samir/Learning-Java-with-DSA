package Basics;
public class SwipeTwoNumbers {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 9;

        System.out.println("Before swapping - ");
        System.out.println("a : " + a + ", b : " + b);
        
        System.out.println("After swapping - ");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a : " + a + ", b : " + b);


    }
}