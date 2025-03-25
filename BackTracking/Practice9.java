package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice9 {

    public static void fun(int ind , int arr[],List<Integer> ans){
        if(ind < 0){
            System.out.println(ans);
            return;
        }

        ans.add(arr[ind]);
        fun(ind - 1, arr, ans);
        ans.remove(ans.size() - 1);
        fun(ind - 1, arr, ans);
    }
    
    public static void fun(int ind , String s , StringBuilder ans){
        if(ind < 0){
            System.out.println(ans.toString());
            return;
        }
        ans.append(s.charAt(ind));
        fun(ind - 1, s, ans);
        ans.deleteCharAt(ans.length() - 1);
        fun(ind - 1, s, ans);

    }

    public static void funPermutations(int ind , int arr[] ,List<Integer> ans){
        if(ind == arr.length){
            System.out.println(ans);
            return;
        }

        for(int i = ind; i < arr.length; i++){
            swap(arr, ind , i);
            ans.add(arr[ind]);

            funPermutations(ind + 1, arr, ans);

            ans.remove(ans.size() - 1);
            swap(arr , ind , i);
        }
    }

  

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

    //    String s = sc.next();

    //    StringBuilder sb = new StringBuilder("");

       int arr[] = new int[n];

       for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
       }

       List<Integer> ans2 = new ArrayList<>();
       funPermutations(0, arr, ans2);
       List<Integer> ans = new ArrayList<>();
       fun(n - 1, arr, ans);

    //    fun(n - 1, s, sb);

       
    }
}
