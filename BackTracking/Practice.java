package BackTracking;

import java.util.Scanner;

public class Practice {

    public static void print(char board[][]){
        for(int i = 0; i < board.length;i++){
            for(int j =0; j< board[0].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row ,  j = col; i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row ,  j = col; i >= 0 && j < board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void calculateBoard(char board[][] , int row){
        if(row == board.length){
            print(board);
            return;
        }

        for(int i = 0; i < board.length; i++){
            if(isSafe(board , row , i)){
                board[row][i] = 'Q';
                calculateBoard(board, row + 1);
                board[row][i] = 'x';
            }
        }
            
    }

    // public static void calculateBoard2(char board[][],int row){
    //     if(row == board.length){
    //         print(board);
    //         return;
    //     }

    //     for(int i = 0; i < board.length; i++){
    //         if(isSafe(board, row, i)){
    //             board[row][i] = 'Q';
    //             calculateBoard(board, row + 1);
    //             board[row][i] = '.';
    //         }
    //     }
    // }



    
                
                
            
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char board[][] = new char[n][m];


        for(int i =0; i < n; i++){
            for(int j =0; j < m; j++){
                board[i][j] ='x';
            }
        }
        calculateBoard(board, 0);

    }
}
