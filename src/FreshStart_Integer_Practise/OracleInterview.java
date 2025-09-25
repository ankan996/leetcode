package FreshStart_Integer_Practise;

public class OracleInterview {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int islandCount = countIslands(matrix);
        System.out.println("Number of islands: " + islandCount); // Output should be 3
    }

    public static int countIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols ||
                grid[i][j] == 0 || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        // Explore all 4 directions (up, down, left, right)
        dfs(grid, visited, i + 1, j); // down
        dfs(grid, visited, i - 1, j); // up
        dfs(grid, visited, i, j + 1); // right
        dfs(grid, visited, i, j - 1); // left
    }
}
