package BackTracking;

import java.util.Scanner;

public class NQueens {

    public static void print(char board[][]){
        System.out.println();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        // Check column
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        
        // Check upper-left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Check upper-right diagonal
        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    
    public static void calculateBoard(char board[][], int row){
        if(row == board.length){
            print(board);
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                calculateBoard(board, row + 1);
                board[row][i] = 'x'; // Backtrack
            }
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }

        calculateBoard(board, 0);
        sc.close(); // Close the scanner
    }
}
