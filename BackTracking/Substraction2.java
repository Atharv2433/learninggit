package BackTracking;

import java.util.Scanner;

public class Substraction2 {

    public static void fun(int  i ,int val, int arr[]){
        //base
        if(i == arr.length){
            return;
        }

        //kaam
        arr[i] = val;
        fun(i + 1, val + 1, arr);
        arr[i] -= 2;
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        fun(0, 1, arr);


        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
