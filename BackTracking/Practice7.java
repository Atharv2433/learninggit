package BackTracking;

import java.util.Scanner;

public class Practice7 {

    public static void allpermutations(String s , String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String nstr = s.substring(0, i) + s.substring(i + 1);
            allpermutations(nstr, ans + ch);
        }
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = "abc";

        allpermutations(s, "");


    }
}
