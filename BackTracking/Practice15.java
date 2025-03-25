package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class Practice15 {


    public int fun(int indx ,int indy , int arr[][] , int n , int m ,int dp[][]){
        if(indx == n && indy == m && arr[indx][indy] != 1){
            return 1;
        }

        if(indx > n || indy > m || arr[indx][indy] == 1){
            return 0;
        }

        if(dp[indx][indy] != -1){
            return dp[indx][indy];
        }

        int left = fun(indx + 1, indy, arr, n, m,dp);
        int down = fun(indx, indy + 1, arr, n, m,dp);


        return dp[indx][indy] = left + down;
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        int dp[][] = new int[n][m];

        for(int row[] : dp){
            Arrays.fill(row , -1);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        Practice15 p15 = new Practice15();
        System.out.println(p15.fun(0, 0, arr, n - 1, m - 1 , dp));

    }
}
