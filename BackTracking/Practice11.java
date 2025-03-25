package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice11 {

    public static void fun(int arr[], int ind,List<Integer> ans){
        if(ind == arr.length){
            System.out.println(ans);
            return;
        }

        for(int i = ind; i < arr.length; i++){
            swap(arr , ind , i);
            ans.add(arr[ind]);
            fun(arr, ind + 1, ans);

            ans.remove(ans.size() - 1);
            swap(arr , ind , i);
        }
    }
    
    public static void swap(int arr[] , int n , int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();

        fun(arr, 0, ans);
    }
}
