package BackTracking;

import java.util.Scanner;

public class StringPermutations {


    public void fun(String s , String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String nString = s.substring(0, i) + s.substring(i + 1);
            fun(nString, ans + ch);
        }
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();


        StringPermutations sp = new StringPermutations();
        sp.fun(s, "");
    }
}
