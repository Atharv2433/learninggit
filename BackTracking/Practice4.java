package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice4 {

    public static void permutaions(String s ,String res){
        if(s.isEmpty()){
            System.out.println(res);
            return;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            String nstr = s.substring(0 , i) + s.substring(i + 1 , s.length());

            permutaions(nstr, res + ch);
        }
    }

    public static void permutaions2(List<Integer> arr,List<Integer> row){
        if(arr.size() == 0){
            System.out.println(row);
            return;
        }

        for(int i = 0; i < arr.size(); i++){
            int curr = arr.get(i);
            arr.remove(i);
            row.add(curr);
            permutaions2(arr, row);
            row.remove(row.size() - 1);
            arr.add(i, curr);
        }
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        List<Integer> arr = new ArrayList<>();
        List<Integer> res = new ArrayList<>();


        for(int i = 0 ; i < n; i++){
            int curr = sc.nextInt();
            arr.add(curr);
        }

        permutaions(s, "");
        permutaions2(arr, res);

    }
}
