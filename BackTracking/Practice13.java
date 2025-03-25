package BackTracking;

import java.util.Scanner;

public class Practice13 {


    public void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public void fun(int ind , int arr[]){
        if(ind == arr.length){
            print(arr);
            return;
        }
        arr[ind] += 2;
        fun(ind + 1, arr); 
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Practice13 p = new Practice13();

        p.fun(0, arr);
    }
}
