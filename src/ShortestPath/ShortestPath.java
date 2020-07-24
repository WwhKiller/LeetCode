package ShortestPath;

/**
 * @description:  最短路径, 只能走下，或者右
 * @author: wwh
 * @create: 2020/7/23
 */
public class ShortestPath {

    public static void main(String[] args) {

        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};

        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {

        int row = grid.length;
        int column = grid[0].length;

        int[][] dp = new int[row][column];

        dp[0][0] = grid[0][0];

        for (int i = 1;i<row;i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }

        for (int j = 1 ; j < column ;j++){
            dp[0][j] = dp[0][j-1]+grid[0][j];
        }

        for (int i = 1 ; i< row ;i++){
            for (int j = 1 ; j <column ;j ++){
                dp[i][j] = Math.min(grid[i][j]+dp[i-1][j],grid[i][j]+dp[i][j-1]);
            }
        }
            return dp[row-1][column-1];
    }
}
