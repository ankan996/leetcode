package FreshStart_Integer_Practise;

public class TwoDimensionalMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}
        };
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        int target = 32;
        search(matrix, rowCount, columnCount, target);
    }

    public static void search(int[][] matrix, int rowCount, int columnCount, int target) {
        int i = 0;
        int j = columnCount - 1;

        while (i < rowCount && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println(target + " is found at index: " + i + ", " + j);
                return;
            } else {
                if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        System.out.println(target + " is not found.");
    }
}
