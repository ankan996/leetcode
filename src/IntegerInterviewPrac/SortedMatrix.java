package IntegerInterviewPrac;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,51}
        };
        int matrixLength = matrix.length;
        System.out.println(matrixLength);
        int target = 32;
        search(matrix, matrixLength, target);
    }

    public static void search(int[][] matrix, int matrixLength, int target) {

        int rows = matrixLength;
        int cols = matrix[0].length;

        int i = 0;
        int j = cols - 1;

        // check boundary conditions and run the loop

        while(i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println(target + " is found at index: " + i + "," + j);
                return;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(target + " is not found.");
    }
}
