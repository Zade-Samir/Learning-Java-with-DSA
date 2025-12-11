package TwoDArray;

public class SearchInSortedMatrix {

    //make the function to find key
    public static boolean isKeyFound(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            //check both row and col are same and print the index
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            }
            //condtion for key < matrix[row][col]
            else if (key < matrix[row][col]) {
                col--;
            }
            //condtion for key > matrix[row][col]
            else if (key > matrix[row][col]) {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    //make the main static function
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int key = 160;
        isKeyFound(matrix, key);
    }
    
}
