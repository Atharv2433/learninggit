package BackTracking;

import java.util.Scanner;

public class Practice12 {


    public void fun(char arr[][]){

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char arr[][] = new char[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = '.';
            }
        }


    }
}
