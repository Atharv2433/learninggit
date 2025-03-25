package BackTracking;

import java.util.Scanner;

public class Practice2 {

    public static void fun(int arr[] ,int ind ,int n){
        if(ind == n + 1){
            return;
        }
        fun(arr, ind + 1, n);
        arr[ind] -= 2;
    }

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        fun(arr, 0,n-1);

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }


    }
}
