package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {

    public static int fun(int x , int y , int n , int m, int dp[][]){
        if(x == n && y == m){
            return 1;
        }
        if(x > n || y > m){
            return 0;
        }
        if(dp[x][y] != -1){
            return dp[x][y];
        }

        int left = fun(x, y + 1, n, m,dp);
        int down = fun(x + 1, y, n, m,dp);

        return dp[x][y] = left + down;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int dp[][] = new int[n][m];

        for(int row[] : dp){
            Arrays.fill(row, -1);
        }

        System.out.println(fun(0, 0, n - 1, m - 1,dp));


    }
}
