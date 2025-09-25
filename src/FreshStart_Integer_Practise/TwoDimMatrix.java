package FreshStart_Integer_Practise;

public class TwoDimMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}
        };

        int target = 32;
        int rowCount = matrix.length;

        int columnCount = matrix[0].length;

        search(matrix, target, rowCount, columnCount);

    }

    public static void search(int[][] matrix, int target, int rowCount, int columnCount) {
        int i = 0;
        int j = columnCount - 1;

        // check for boundary condition and run the while loop

        while (i < rowCount && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println(target + " is found at index: " + i + "," + j);
                return;
            } else {
                if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }

            }
        }
        System.out.println(target + " is not found!");
    }
}
