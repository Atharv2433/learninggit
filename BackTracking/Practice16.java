package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice16 {


    public void fun(int ind , int arr[] , List<Integer> ans){
        if(ind == arr.length){
            System.out.println(ans);
            return;
        }

        for(int i = ind; i < arr.length; i++){
            swap(arr , i , ind);
            ans.add(arr[ind]);

            fun(ind + 1, arr, ans);


            ans.remove(ans.size() - 1);
            swap(arr , i , ind);
        }
    }

    public void swap(int arr[] , int ind , int ind2){
        int temp = arr[ind];
        arr[ind] = arr[ind2];
        arr[ind2] = temp;
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Practice16 p = new Practice16();
        List<Integer> ans = new ArrayList<>();
        p.fun( 0 , arr , ans);
    }
}
