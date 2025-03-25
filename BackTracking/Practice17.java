package BackTracking;

import java.util.Scanner;

public class Practice17 {

    public void print(char ch[][]){
        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < ch[0].length; j++){
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isSafe(char ch[][] , int row , int col){


        for(int i = 0; i < row; i++){
            if(ch[row][i] == 'Q'){
                return false;
            }
        }


        for(int i = row , j = col; i >= 0 && j >= 0; i-- , j--){
            if(ch[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row , j = col; i >= 0 && j < ch.length; i-- , j++){
            if(ch[i][j] == 'Q'){
                return false;
            }
        }



        return true;
    } 

    public void fun(int ind , char ch[][]){
        if(ind == ch.length){
            print(ch);
            return;
        }

        for(int i = 0; i < ch[0].length; i++){
            if(isSafe(ch , i , ind)){
                ch[ind][i] = 'Q';
                fun(ind + 1, ch);
                ch[ind][i] = '.';
            }
        }
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char ch[][] = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ch[i][j] = '.';
            }
        }
    }
}
