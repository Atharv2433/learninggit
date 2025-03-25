package BackTracking;

import java.util.Scanner;

public class NQueensPractice2 {

    public void print(char arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isSafe(char arr[][] , int row ,int col){
        for(int i = 0; i < row; i++){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row , j = col; i >= 0 && j >= 0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row , j = col; i >= 0 && j < arr.length; i-- , j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void fun(int row , char arr[][]){
        if(row == arr.length){
            print(arr);
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(isSafe(arr , row , i)){
                arr[row][i] = 'Q';
                fun(row + 1, arr);
                arr[row][i] = '.';
            }
        }
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char arr[][] = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = '.';
            }
        }

        NQueensPractice2 p2 = new NQueensPractice2();
        p2.fun(0, arr);
    }
}
